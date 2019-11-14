package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by brprashant on 3/28/17.
 */
public class timeCal {

    public static void main(String[] args){
//        Scanner sc = new Scanner("34:23");
//        sc.useDelimiter(":");
//        while(sc.hasNext()){
//            System.out.println(sc.nextInt());
//        }

        Scanner sc = new Scanner(System.in);
        int[] alph = new int[10];
        for (int i = 0; i < alph.length; i++){
            int num = sc.nextInt();
            alph[i] = num;
        }
        int[] delt = new int[10];
        for (int i = 0; i < delt.length; i++){
            delt[i] = alph[9-i];
            System.out.println(delt[i]);
        }


    }


}
