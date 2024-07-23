import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        int[] ans = Insertionsort(arr);
        System.out.println(Arrays.toString(ans));
        
    }static int[] Insertionsort(int[] array){
        for(int i = 0;i<array.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else{
                    break;
                }
            }
        }
        return array;
    }
}