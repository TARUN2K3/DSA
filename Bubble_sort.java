import java.util.*;
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }static int[] sort(int[] array){
        boolean swapping;
        for(int i = 0; i<array.length;i++){
            swapping = false;
            for(int j  =1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swapping = true;
                }
            }if(!swapping){
                break;
            }
        }
        return array;
    }
}
