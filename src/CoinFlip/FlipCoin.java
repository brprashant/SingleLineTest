package CoinFlip;

/**
 * Created by brprashant on 4/24/16.
 */
public class FlipCoin {

    public static void main(String[] args){
        Coin coin=new Coin();
        int headCount =0, tailCount =0;
        for(int i=0;i<100;i++) {
            final SIDE side = coin.tossCoin();
            if (side == SIDE.HEAD) headCount++;
            if (side == SIDE.TAIL) tailCount++;
            System.out.println(side);
        }
        System.out.print(" HEAD : " + headCount);
        System.out.print(" TAIL : " + tailCount);
    }
}
