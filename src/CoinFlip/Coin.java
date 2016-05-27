package CoinFlip;

import java.util.Random;

/**
 * Created by brprashant on 4/24/16.
 */
public class Coin {




    public SIDE getSide(int i){
        return SIDE.valueOf(i);
    }


    public SIDE tossCoin(){
        Random run = new Random();
        final int random = run.nextInt(2147483647);
        final int id = random%2 == 0 ? 2 : 1;
        return getSide(id);
    }

    public SIDE tossCoin(int options){
        Random run = new Random();
        final int seed = run.nextInt(options);
        final int id = seed%2;
        return getSide(id==0 ? 2 : 1 );
    }




}
