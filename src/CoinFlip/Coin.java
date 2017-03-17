package CoinFlip;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Created by brprashant on 4/24/16.
 */
public class Coin<T> {

    SIDE side;

    public Coin() {
        this(SIDE.HEAD);
    }

    public Coin(SIDE side) {
        this.side = side;
    }

    public SIDE getSide() {
        return side;
    }

    public SIDE getSide(int i){
        return SIDE.valueOf(i);
    }


    public SIDE tossCoin(){
        Random run = new Random();
        final int random = run.nextInt(2147483647);
        final int id = random%2 == 0 ? 2 : 1;
        side=getSide(id);
        return side;
    }

    public SIDE tossCoin(int options){
        Random run = new Random();
        final int seed = run.nextInt(options);
        final int id = seed%2;
        return getSide(id==0 ? 2 : 1 );
    }

    public static <T extends Comparable<? super T>> void something (List<T> values, int sum){


    }

    public static <T extends Comparable<? super T>> boolean findSum(final List<T> bag, int sum){
        Collections.sort(bag);
        for(T val : bag) {

        }
        return true;
    }

}
