import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 7, 8};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int max(int[] array, int start, int end) {
        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int[] sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int maxIndex = max(array, 0, array.length - 1 - j);
            int temp = array[array.length - 1 - j];
            array[array.length - 1 - j] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}
