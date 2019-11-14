package bavarainttest;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by brprashant on 6/16/19.
 */
enum Side { NONE, LEFT, RIGHT }


public class ChainLink {

    private ChainLink left, right;

    public void append(ChainLink rightPart) {
        if (this.right != null)
            throw new IllegalStateException("Link is already connected.");

        this.right = rightPart;
        rightPart.left = this;
    }

    public Side longerSide() {
        int rightCount = 0;
        int leftCount = 0;
        ChainLink currChainLink = this;
        if (currChainLink.left != null) {
            leftCount++;
        }

        Set<ChainLink> seen = new HashSet<>();
        while (currChainLink.right!= null) {
            if (seen.contains(currChainLink)) {
                return Side.NONE;
            }
            seen.add(currChainLink);
            currChainLink = currChainLink.right;
            if (this == currChainLink) {
                return Side.NONE;
            }
            rightCount++;
            if (currChainLink.left!=null){
                leftCount++;
            }
        }
        return rightCount > leftCount ? Side.RIGHT : Side.LEFT;

//        throw new UnsupportedOperationException("Waiting to be implemented.");
//        System.out.println("");
    }

    public static void main(String[] args) {
        ChainLink left = new ChainLink();
        ChainLink middle = new ChainLink();
        ChainLink right = new ChainLink();
        left.append(middle);
        middle.append(right);
        System.out.println(left.longerSide());
        System.out.println(middle.longerSide());
        System.out.println(right.longerSide());
        right.append(left);
        System.out.println(left.longerSide());
        System.out.println(middle.longerSide());
        System.out.println(right.longerSide());

    }
}
