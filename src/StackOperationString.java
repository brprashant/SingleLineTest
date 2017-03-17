import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by brprashant on 6/1/16.
 */
public class StackOperationString {

    public static void main (String[] args){
        System.out.println(solution("5 6 + -"));
        System.out.println(solution("3 DUP 5 - -"));
        System.out.println(solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

    public static final int MAX_VALUE = (int)Math.pow(2d,20d)-1;  //2^20-1;
    public static final int MIN_VALUE = 0;

    public static int solution(String S) {
        // write your code in Java SE 8
        if (S==null) return 0;
        Scanner sc = new Scanner(S);
        final List<Integer> stack = new ArrayList<>();
        while (sc.hasNext()){
            String operation = sc.next();
            switch(operation){
                case "POP" :
                    if (stack.size()<1) return -1;
                    pop(stack);
                    break;
                case "DUP" :
                    if (stack.size()<1) return -1;
                    int val = pop(stack);
                    push(stack,val);
                    push(stack,val);
                    break;
                case "+" :
                    if (stack.size()<2) return -1;
                    int res = pop(stack)+pop(stack);
                    if (res > MAX_VALUE) return -1;
                    push(stack, res);
                    break;
                case "-" :
                    if (stack.size()<2) return -1;
                    int leftVal = pop(stack);
                    int rightVal = pop(stack);
                    int result =leftVal-rightVal;
                    if (result < MIN_VALUE) return -1;
                    push(stack, result);
                    break;
                default : int number = Integer.parseInt(operation);
                    if (number > MAX_VALUE) return -1;
                    if (number < MIN_VALUE) return -1;
                    push(stack,number);
                    break;
            }
        }
        return pop(stack);
    }

    public static void push(final List<Integer> stack, final int value){
        stack.add(value);
    }

    public static int pop(final List<Integer> stack){
        int len = stack.size();
        int retVal = stack.get(len-1);
        stack.remove(len-1);
        return retVal;
    }
}
