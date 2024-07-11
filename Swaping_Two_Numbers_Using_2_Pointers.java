import java.util.Arrays;

public class Swaping_Two_Numbers_Using_2_Pointers {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int first_element = 0;
        int last_element = arr.length-1;
        while (first_element<last_element) {
            swap(arr, first_element, last_element);
            first_element++;
            last_element--;
        }
        System.err.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
