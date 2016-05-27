package packageOne;

import depthOne.TestInOne;

import java.util.Arrays;

/**
 * Created by brprashant on 4/3/16.
 */
public class TestSubClassTestInOne<T> extends TestInOne {
    public static void main(String[] args){
        TestInOne obj = new TestInOne();
        System.out.println(obj.publicvalue);

        //System.out.println(obj.novalue);
        // System.out.println(TestInOne.staticNovalue);

        System.out.println(TestInOne.protectedStaticValue);
    }

    @Override
    public void doSomething() {
        System.out.println("Sparrow");
    }

    public void printFizzBuzz(){
        final int n=100;

        for(int i=1;i<=n;i++){
            if (i%15==0) {
                System.out.println("fizzbuzz");
                continue;
            }
            if (i%5==0) {
                System.out.println("buzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else {
                System.out.println(Integer.toString(i));
            }
        }
    }

    //palindrome
    public boolean isPalindrome(final String str){
        if (null==str) return false;
        final int len = str.length();
        if (len<1) return false;
        if (len==1) return true;
        for(int i=0;i<len/2;i++){
            if (str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeRecursive(String str){
        if (null==str) return false;
        final int len = str.length();
        if (len<1) return false;
        if (len==1) return true;
        return isPalindrome(str,0);
    }

    public boolean isPalindrome(final String str, int i){
        final int len = str.length();
        if (i==len/2) return true;
        int j=len-i;
        if (j>len-1) return false;
        if (str.charAt(i)== str.charAt(j)) {
            return isPalindrome(str,i+1);
        } else {
            return false;
        }
    }


    class PrashantArrayList<T>{

        private T[] arrayList;
        private int sz=-1;
        private int index=-1;

        PrashantArrayList(){
            this.arrayList = (T[])new Object[1];
            sz=1;
            index=0;
        }

        PrashantArrayList(int size){
            arrayList = (T[])new Object[size];
            this.sz=size;
            index=0;
        }

    void add(T value){
        if (index<sz){
            arrayList[index++]= value;
        } else {
            increaseSize(sz*2);
            add(value);
        }
    }

    private void increaseSize(int newSize){
        arrayList = Arrays.copyOf(arrayList,newSize);
        this.sz=newSize;
    }

}




//    void printBinaryTree(Node start){
//
//        if (start==null) return;
//
//        final Node left = start.left;
//        if (left != null) printBinaryTree(start.left);
//
//        System.out.println(start.value);
//
//        final Node right = start.right;
//        if (right != null) printBinaryTree(start.right);
//
//    }


}
