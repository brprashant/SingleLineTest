import java.util.Optional;

/**
 * Created by brprashant on 3/21/16.
 */
public class KNumber {

    public static void main(String[] args) {
        System.out.println(kthNumber(new int[]{1,62,2,2,4,5,34, 3, 4, 5}, 0));
    }

    public static Optional<Integer> kthNumber(int[] array, int k) {

        if (null == array) return Optional.empty();
        if (array.length < k) return Optional.empty();

        return quickSortFindk(array, 0, array.length - 1, k);
    }

    private static Optional<Integer> quickSortFindk(int[] array, int startIndex, int endIndex, int kToFind) {
        if (null == array) return Optional.empty();
        if (endIndex < startIndex) return Optional.empty();
        if (endIndex > array.length) return Optional.empty();

        int pivot = array[startIndex];
        int i = startIndex + 1;
        int j = endIndex;

        while (i<j){
            while ((array[i] <= pivot) && (i<endIndex)) {
                i++;
            }
            while ((array[j] > pivot) && j>startIndex) {
                j--;
            }
            if (i<j) exchange(array, i, j);
        }
        if (i==j) exchange(array,startIndex,i);

        if (i == kToFind) return Optional.of(array[i]);
        if (i < kToFind) return quickSortFindk(array, i, endIndex, kToFind);
        if (i > kToFind) return quickSortFindk(array, startIndex, i - 1, kToFind);
        return Optional.empty();
    }

    private static void exchange(int[] array, int i, int j) {
        if (null == array) return;
        if (i < 0) return;
        if (j >= array.length) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
