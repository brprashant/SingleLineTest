package MathSample;

/**
 * Created by brprashant on 5/3/16.
 */
public class SampleSqrt {

    public static void main(String[] args){
        String start = "17";
        String end  = "24";
        double startsqrt = Math.sqrt(Double.valueOf(start));
        double endsqrt = Math.sqrt(Double.valueOf(end));
        double startSearch = startsqrt%1>0 ? Math.ceil(startsqrt) : Math.floor(startsqrt);
        System.out.println(startSearch);
        double endSearch = endsqrt%1<0 ? Math.ceil(endsqrt) : Math.floor(endsqrt);
        System.out.println(endSearch);
        System.out.println((int)(endSearch-startSearch)+1);
//        System.out.println(MathSample.sqrt(16)%1==0? "Zero" : "Not zero");
//        System.out.println(MathSample.sqrt(24));

        System.out.println(countdivisors(1012,1012));
    }



    public static int countdivisors(int number, int remainingDigits){
        if (number < 10 && number == remainingDigits) return 1;
        if (remainingDigits == 0) return 0;

        int lastDigit = remainingDigits%10;
        int remains = remainingDigits/10;

        if (lastDigit == 0) return countdivisors(number,remains);
        return number%lastDigit == 0 ? 1 + countdivisors(number,remains) : countdivisors(number,remains);
    }



}
