import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brprashant on 6/1/16.
 */
public class BigIntCalc {

	public static void main(String[] args) {
		System.out.println(solution(10, 10));
	}

	public static int solution(int A, int B) {
		// write your code in Java SE 8
		BigInteger solution = BigInteger.valueOf(A).multiply(BigInteger.valueOf(B));
		int oneCount = 0;
		int remainder = 0;
		BigInteger quotient = solution;
		BigInteger number = BigInteger.valueOf(2L);
		while (quotient.compareTo(BigInteger.ONE) > 0) {
			remainder = quotient.remainder(number).intValue();
			quotient = quotient.divide(number);
			if (remainder == 1) {
				oneCount++;
			}
		}
		if (quotient.compareTo(BigInteger.ONE) == 0) {
			oneCount++;
		}
		return oneCount;

	}

	// This is the text editor interface.
	// Anything you type or change here will be seen by the other person in real time.
/*

The count-and-say sequence is the sequence of integers beginning as follows: 1, 11, 21, 1211, 111221, ...
1 is read off as "one 1" or 11. 
11 is read off as "two 1s" or 21. 
21 is read off as "one 2, then one 1" or 1211. 


Given input: 3
output: 21

input: 5
output: 111221
*/


	int giveNumber(int n) {
		if (n <= 0) {
			return -1;
		}
		int[] digits = order(n);
		int len = digits.length;
		int retVal = 0;
		for (int i = 0; i < len; i++) {
			int num = digits[i];
			int total = 1;
			for (int j = i + 1; j < len + 1; j++) {
				if ((j < len) && (digits[j] == num)) {
					total++;
				} else {
					if (j == len) {
						total++;
					}
					if (total < 10) {
						retVal = retVal * 10 + total;
					} else {
						int[] numbersToAppend = order(total);
						int ll = numbersToAppend.length;
						for (int k = 0; k < ll; i++) {
							retVal = retVal * 10 + numbersToAppend[k];
						}
					}
					if (num < 10) {
						retVal = retVal * 10 + num;
					} else {
						int[] numbersToAppend = order(num);
						int ll = numbersToAppend.length;
						for (int k = 0; k < ll; i++) {
							retVal = retVal * 10 + numbersToAppend[k];
						}
					}
					if (j < len) {
						num = digits[j];
						i = j;
						total = 1;
					}
				}
			}
		}
		return retVal;
	}

	int[] order(int s) {
		StackWithArrays<Integer> sta = new StackWithArrays<>();
		int val = s;
		int len = 0;
		while (val >= 1) {
			sta.push(10);
			val = val / 10;
			len++;
		}
		int[] retVal = new int[len];
		int i = 0;
		while (sta.size > 0) {
			retVal[i++] = sta.pop();
		}
		return retVal;
	}

}
