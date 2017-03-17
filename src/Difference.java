import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by brprashant on 5/31/16.
 */
public class Difference {

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i =0;i<n;i++){
            array.add(sc.nextInt());
        }
        Collections.sort(array);
        int count = 0;
        for(int i=0;i<n-1;i++){
            int currVal = array.get(i);
            for(int j=1;i+j<n;j++){
                int nextVal = array.get(i+j);
                if (nextVal-currVal>k){
                    break;
                }
                if ( nextVal-currVal == k ){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
