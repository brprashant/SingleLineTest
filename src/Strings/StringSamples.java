package Strings;

import java.util.*;

/**
 * Created by brprashant on 9/26/15.
 */
public class StringSamples {

    static long postOrderCalculate(String string){
        if (string == null) return 0;
        String[] tokens = string.split("\\s");
        int len=tokens.length;
        Stack<Long> operandStack = new Stack<>();
        for(int i=0;i<len;i++){
            String token = tokens[i];
            switch(token){
                case "*":
                    operandStack.push(operandStack.pop()*operandStack.pop());
                    break;
                case "/":
                    long rightValue = operandStack.pop();
                    long leftValue = operandStack.pop();
                    operandStack.push(leftValue/rightValue);
                    break;
                case "+":
                    operandStack.push(operandStack.pop()+operandStack.pop());
                    break;
                case "-":
                    long subtract = operandStack.pop();
                    long sbtractFrom = operandStack.pop();
                    operandStack.push(sbtractFrom-subtract);
                    break;
                default :
                    long value = Long.valueOf(token);
                    operandStack.push(value);
                    break;
            }
        }
        return operandStack.pop();
    }


    public StringSamples(){
        String text= "fgkbfkj";
        char[] characters = text.toCharArray();
        int len= characters.length;
    }

    static boolean noUniqueChar(String something){
        char[] characters = something.toCharArray();
        if (characters.length > 256) return false;
        int charCheck[] = new int[256];
        for (char character : characters) {
            if (charCheck[character] > 0) return false;
            charCheck[character]++;
        }
        return true;
    }

    public static void main(String[] args){
        String something = "text here";
        System.out.println(noUniqueChar("agksoihdf"));
        System.out.println(something + " " + charToString(something.toCharArray()));

        charToString(null);
        String testString = "The quick brown fox jumped over the lazy dog.";
        System.out.println(charToString(reverseString(testString)));

        String spaceTest = "some thing ";
        System.out.println(replaceSpaceInString(spaceTest));

        String toCompress = "aaabcd";
        System.out.println(compressString(toCompress));


        int[][] image = new int[3][3];
        image[0][0]= 1;
        image[0][1]= 4;
        image[0][2]= 7;
        image[1][0]= 2;
        image[1][1]= 5;
        image[1][2]= 8;
        image[2][0]= 3;
        image[2][1]= 6;
        image[2][2]= 9;


        printMatrix(image);
        System.out.println("Rotated");
        printMatrix(rotate(image));

    }

    static void printMatrix(int[][] image){
        if (image== null ) return;
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print("\t" + image[i][j]);
            }
            System.out.println();
        }
        return;
    }

    static String charToString(char[] characters){
        if (characters == null) return null;
        if (characters.length < 1) return null;
        int len = characters.length;
        StringBuilder builder = new StringBuilder(len);
        for(int i = 0 ; i< len ; i++){
            builder.append(characters[i]);
        }
        return builder.toString();
    }

    static String charToString(char[] characters, int size){
        if (characters == null) return null;
        if (size < 1) return null;
        StringBuilder builder = new StringBuilder(size);
        for(int i = 0 ; i< size; i++){
            builder.append(characters[i]);
        }
        return builder.toString();
    }

    static char[] reverseString(String something){
        if (something == null ) return null;
        if (something.length() <= 1) return something.toCharArray();
        int len = something.length();
        char[] characters= something.toCharArray();
        Set<Character> limit = new HashSet<>();
        limit.add('_');
        limit.add(' ');
        limit.add('.');
        //limit.addAll(Arrays.asList(' ', '-', '.'));
        for (int i=0,offset=0 ; i<(len-1-offset) ;i++,offset++ ){
            if (limit.contains(characters[i])) {
                i++;
                if (i >= (len-1-offset)) break;
            }
            if (limit.contains(characters[len-1-offset])) {
                offset++;
                if (i >= (len-1-offset)) break;
            }
            char t = characters[i];
            characters[i] = characters[len-1-offset];
            characters[len-1-offset] = t;
        }
        return characters;
    }

    boolean partOf(String one, String two){

        return false;
    }

    static char[] replaceSpaceInChar(final String something ){
        int stringLen = something.length();
        int originalTextLength = 0;
        char[] builder = new char[stringLen];
        for(int i=0;i<stringLen;i++){
            System.out.println(something.charAt(i));
            if (something.charAt(i)== '\0') {
                originalTextLength = i;
                break;
            }
        }
        for(int j=originalTextLength-1, i=stringLen-1;j>=0;j--){
            if (something.charAt(j) == ' '){
                builder[i]='0';
                builder[i-1]='2';
                builder[i-2]='%';
                i=i-2;
            }else {
                builder[i--]=something.charAt(j);
            }
        }
        return builder;
    }

    static String replaceSpaceInString(final String something ){
        if (something == null) return null;
        int stringLen = something.length();
        int spaceCount = 0;
        for(int i=0;i<stringLen;i++){
            if (something.charAt(i)== ' ') {
                spaceCount++;
            }
        }
        if (spaceCount<1) return something;
        char[] builder = new char[stringLen + spaceCount*2];
        for(int j=stringLen-1, i=builder.length-1;j>=0;j--){
            if (something.charAt(j) == ' '){
                builder[i]='0';
                builder[i-1]='2';
                builder[i-2]='0';
                i=i-3;
            }else {
                builder[i--]=something.charAt(j);
            }
        }
        return charToString(builder);
    }

    static String compressString(String text){
        if (text == null) return null;
        int originalLength = text.length();
        char currChar = text.charAt(0);
        int count =1;
        char[] builder = new char[originalLength];
        builder[0] = currChar;
        int builderIndex = 1;
        try {
            for (int originalTextIndex = 1; originalTextIndex < originalLength; originalTextIndex++) {
                if (text.charAt(originalTextIndex) == currChar) {
                    count++;
                } else {
                    builderIndex = appendToChar(builder, builderIndex, String.valueOf(count).toCharArray());
                    currChar = text.charAt(originalTextIndex);
                    builder[builderIndex++]=currChar;
                    count = 1;
                }
            }
        } catch (ArrayIndexOutOfBoundsException aioe){
            return text;
        }
        return charToString(builder, builderIndex);
    }

    static int appendToChar(final char[] builder, int currBuilderIndex, char[] numberText) throws ArrayIndexOutOfBoundsException{
        int numberTextLen = numberText.length;
        for(int i=0;i<numberTextLen ; i++){
                builder[currBuilderIndex] = numberText[i];
                currBuilderIndex++;
        }
        return currBuilderIndex;
    }


    static int[][] rotate(final int image[][]){
        if (image == null) return null;
        int rows = image.length;
        if (rows < 2) return image;
        int cols= image[0].length;
        int[][] newImg= new int[rows][cols];

        for(int i=0; i<rows/2; i++ ){
            int[] temp = new int[cols];
            for(int j=0; j<cols; j++){
                temp[j]=image[i][j];
                newImg[i][j]=image[rows-1-j][i];
                newImg[rows-1-j][i]=image[i][cols-1-j];
                newImg[rows-1-i][cols-1-j]=image[rows-1-j][cols-1-i];
                newImg[rows-1-j][cols-1-i]=temp[j];
            }
            cols--;
        }
        return newImg;
    }

}
