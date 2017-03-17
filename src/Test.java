import org.junit.Assert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by brprashant on 6/22/16.
 * Create a program to print  Fibonacci sequence
 * First 20
 * 0,1,1,2,3,5,8,13....
 *
 */
public class Test {

    public static void main(String[] args){
        fibb(20);
    }

    private static int fib(int n){
        if (n==0)  return 0;
        if (n==1) return 1;
        return fib(n-1)+fib(n-2);
    }


    private static void fibb(int n){
        for(int i=0;i<n-1;i++){
            System.out.print(fib(i) + ",");
        }
        System.out.print(fib(n-1));
    }

    public static int nonRepeating(int[] lst){
        Set<Integer> st = new HashSet<>();
        for(int val : lst){
            if (st.contains(val)){
                st.remove(val);
            } else {
                st.add(val);
            }
        }

        if (st.size() >= 1) {
            return (int)st.toArray()[0];
        } else throw new RuntimeException("");
    }

    @org.junit.Test
    public static void testNonRepeating(){
        int[] arr = { 1, 2, 1, 2, 3, 5, 3 };
        Assert.assertEquals(nonRepeating(arr) ,5);
        Assert.assertEquals(nonRepeating(arr),1);
        arr = new int[]{1, 2, 1, 2, 3, 5, 3, 5};
        Assert.assertNull(nonRepeating(arr));
    }

}
