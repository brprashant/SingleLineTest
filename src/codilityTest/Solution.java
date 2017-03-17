package codilityTest;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Sample questions in Codility
 *
 * Created by brprashant on 2/5/17.
 */
public class Solution {
    public static final int MAX_STROKES=1000000000;
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len=A.length;
        if (len<=0) return -1;
        long currStrokes=0;
        int currNumber=0;
        for(int i=0;i<len && currStrokes<= MAX_STROKES;i++){
            if (A[i]>currNumber){
                currStrokes=currStrokes + (A[i]-currNumber);
            }
            currNumber=A[i];
        }
        if (currStrokes > MAX_STROKES) {
            return -1;
        }
        return (int)currStrokes;
    }

    public static void main (String[] args){
        Solution sol=new Solution();
        int[] arr={5,6,5,6,7,4,6,0,4,3,3,5,8};
//        int[] arr={500000000,1,2147483647};
        int val=sol.solution(arr);
        System.out.println(val);


        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        System.out.println(set.size());


        Solution solObj=new Solution();
        System.out.println(solObj.solution(" A2Le aa A2Le  A2Le A2Le A2Le  A2Le a10 55 ", " 5 2 A2Le A2Le A2Le  A2Le     A2Le 11 54a"));
        System.out.println(solObj.solution("A2Le", "5"));
        System.out.println(solObj.solution("A2Le", "A2le"));
        System.out.println(solObj.solution("ba1", "1Ad"));
        System.out.println(solObj.solution("3x2x", "8"));
        System.out.println(solObj.solution("", ""));
        System.out.println(solObj.solution("", null));

    }

    public int solution(Tree T) {
        // write your code in Java SE 8
        if (T==null) return 0;
        HashSet<Integer> set= new HashSet<>();
        return maxDistinct(set,T);
    }

    private int maxDistinct(HashSet<Integer> set, Tree t) {
        if (set==null) throw new IllegalArgumentException("Set cannot be empty to find out maximum distinct values");
        if (t==null) return set.size();
        HashSet<Integer> lSet = new HashSet<>(set);
        lSet.add(t.x);
        HashSet<Integer> rSet = new HashSet<>(set);
        rSet.add(t.x);
        int lNum = lSet.size();
        int rNum = rSet.size();
        if (t.l!=null) {
            lNum=maxDistinct(lSet,t.l);
        }
        if (t.l!=null) {
            rNum=maxDistinct(rSet,t.r);
        }
        return max(lNum,rNum);
    }

    private int max(int lNum, int rNum) {
        return lNum>rNum? lNum : rNum;
    }


    private boolean solution(String S, String T) {
        // write your code in Java SE 8

        if(S==null || T==null){
            return false;
        }

        String sArr[] = S.split("\\s+");
        String tArr[] = T.split("\\s+");

        int sLen = sArr.length;
        int tLen = tArr.length;

        if (sLen!=tLen) return false;

        for(int i=0;i<sLen;i++){
            if (!check(sArr[i],tArr[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean check(String s, String t) {
        StringPattern sPat = new StringPattern(s);
        StringPattern tPat = new StringPattern(t);
        return sPat.patternEquals(tPat);
    }

    private boolean isDigit(char ch){
        return ch<='9' && ch >='0';
    }

    private class StringPattern{
        private List<Character> characterList;

        private StringPattern(String str){
            super();
            characterList=new ArrayList<>();
            int len = str.length();

            for(int i=0;i<len;){
                char ch = str.charAt(i);
                if(isDigit(ch)){
                    int num=ch-'0';
                    while(i+1<len){
                        if(isDigit(str.charAt(i+1))){
                            num=num*10+str.charAt(i+1)-'0';
                            i++;
                        } else {
                            break;
                        }
                    }
                    for(int k=0;k<num;k++){
                        characterList.add('*');
                    }
                } else {
                    characterList.add(ch);
                }
                i++;
            }
        }


        private boolean patternEquals(StringPattern compareTo){

            List<Character> compareToList = compareTo.characterList;
            if (characterList.size()!=compareToList.size()) {
                return false;
            }

            int len=characterList.size();
            for(int i=0;i<len;i++){
                char sChar = characterList.get(i);
                char compareChar = compareToList.get(i);
                if (!(sChar=='*' || compareChar=='*' || sChar==compareChar)) {
                    return false;
                }
            }
            return true;
        }


    }

}
