package MathSample;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by brprashant on 5/9/16.
 */
public class BigIntegerSample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int zero= sc.nextInt();
        int one= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(getInt(zero, one, n-1));
    }

    private static int getInt(int zero, int one, int n){
        BigInteger valueFound = findInt(zero,one,n);
        System.out.println(valueFound);
        return valueFound.intValue();
    }

    private static BigInteger findInt(int zero, int one, int n){
        if (n==0) return BigInteger.valueOf((long)zero);
        if (n==1) return BigInteger.valueOf((long)one);
        BigInteger toSquare = findInt(zero,one,n-1);
        toSquare.multiply(toSquare);
        return findInt(zero,one,n-2).add(toSquare.multiply(toSquare));
    }
}
