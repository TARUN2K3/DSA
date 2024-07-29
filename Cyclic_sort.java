import java.util.*;
public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }static void sort(int[] array){
        int i = 0;
        while (array.length>i) {
            int correct = array[i]-1;
            if(array[i] != array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }
    }static void swap(int[] array,int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
