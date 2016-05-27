/**
 * Created by brprashant on 10/13/15.
 */
public class UserOfStackWithArrays {

    public static  void main(String[] args){
        try {
            StackWithArrays<Integer> stack = new StackWithArrays<>();
            System.out.println("0:size : " + stack.size);
            System.out.println("0:top " + stack.top);
            stack.push(1);

            System.out.println("1:size : " + stack.size);
            System.out.println("1:top " + stack.top);

            stack.push(2);
            System.out.println("2:size : " + stack.size);
            System.out.println("2:top " + stack.top);

            stack.push(3);
            System.out.println("3:size : " + stack.size);
            System.out.println("3:top " + stack.top);

            stack.push(4);
            System.out.println("4:size : " + stack.size);
            System.out.println("4:top " + stack.top);

            System.out.println("Pop : " + stack.pop());
            System.out.println("5:size : " + stack.size);
            System.out.println("5:top " + stack.top);

            System.out.println("POP : " + stack.pop());
            System.out.println("6:size : " + stack.size);
            System.out.println("6:top " + stack.top);

            System.out.println("POP : " + stack.pop());
            System.out.println("7:size : " + stack.size);
            System.out.println("7:top " + stack.top);

            System.out.println("POP  : " + stack.pop());
            System.out.println("8:size : " + stack.size);
            System.out.println("8:top " + stack.top);

            System.out.println("POP  : " + stack.pop());
            System.out.println("8:size : " + stack.size);
            System.out.println("8:top " + stack.top);


            System.out.println("POP  : " + stack.pop());
            System.out.println("9:size : " + stack.size);
            System.out.println("9:top " + stack.top);
            System.out.println("POP  : " + stack.pop());
            System.out.println("10:size : " + stack.size);
            System.out.println("10:top " + stack.top);

            stack.push(8);
            System.out.println("11:size : " + stack.size);
            System.out.println("11:top " + stack.top);

            System.out.println("POP  : " + stack.pop());
            System.out.println("10:size : " + stack.size);
            System.out.println("10:top " + stack.top);

            System.out.println("POP  : " + stack.pop());
            System.out.println("10:size : " + stack.size);
            System.out.println("10:top " + stack.top);
        }catch(Exception ae) {
            ae.printStackTrace();
        }

    }
}
