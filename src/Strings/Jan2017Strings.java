package Strings;

import java.util.Random;

/**
 * Created by brprashant on 1/16/17.
 */
public class Jan2017Strings {
    static int[] values = {2,3,4,5,6};

    public static void main (String[] args){
        System.out.println("Here we are.");
        for(int val : Jan2017Strings.values ){
            System.out.println(val);
        }

        Random rand = new Random();
        System.out.println(rand.nextInt(75));

    }
}
