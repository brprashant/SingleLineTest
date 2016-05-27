import java.io.IOException;
import java.util.*;

/**
 * Created by brprashant on 3/21/16.
 */
public class QuickSort {

    public static void main(String[] args){
        QuickSort sortingTest = new QuickSort();
        sortingTest.quickSort(new int[]{2,4,2,6,8,3,1,15,7});
        sortingTest.quickSort(new int[]{2,2,2,23,34,23});
        sortingTest.quickSort(new int[]{2,2,1,1,3,3,5,7});
        sortingTest.quickSort(new int[]{2,4,1,6,8,3,5,7});
        sortingTest.quickSort(new int[]{1,2,3,4,5,6,7,8});

        Set<Integer> arraySizes=new LinkedHashSet<>();
        TreeMap<Integer,ArrayList<Integer>> something = new TreeMap<>();

        Iterator<Integer> sizes = arraySizes.iterator();
        while (sizes.hasNext()){
            ArrayList<Integer> arrayToPrint = something.get(sizes.next());


        }
    }

    public int[] quickSort(int[] array){
        if (null==array) return null;
        if (array.length<=1) return array;

        quickSort(array,0,array.length-1);
        System.out.println("Array after sorting = " + Arrays.toString(array));

        return null;
    }

    private void quickSort(int[] array, int startIndex, int endIndex) {
        if (null==array) return;
        if (startIndex>endIndex) return;
        if (startIndex==endIndex) return;

        int pivot = array[startIndex];
        int i=startIndex+1;
        int j=endIndex;
        while(i<j){
            while ((i<endIndex) && (array[i]<=pivot)){
                i++;
            }
            while ((j>startIndex) && (array[j]>pivot)){
                j--;
            }
            if (i<j) {
                exchange(array,i,j);
            }
        }
        exchange(array, startIndex,i-1);
        quickSort(array,startIndex,i-1);
        quickSort(array,i,endIndex);
    }

    private void exchange(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
