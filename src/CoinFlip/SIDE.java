package CoinFlip;

/**
 * Created by brprashant on 5/3/16.
 */
public enum SIDE{
    HEAD(1),
    TAIL(2);
    final int id;
    SIDE(int id){
        this.id=id;
    }

    public static SIDE valueOf(int i){
        if ((i<1) || (i > 2)) throw new UnsupportedOperationException("only 1 and 2 are allowed");
        if (i==1) return HEAD;
        else return TAIL;

    }
}
