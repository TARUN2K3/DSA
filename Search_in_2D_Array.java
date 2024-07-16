import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,34,56,78},{21,3,5,675,3,45},{7,64,6,643,346,46,4},{355,3,546,635,45}};
        int target = 45;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] array, int element){
        for(int i = 0; array.length>i;i++){
            for(int j = 0; array[i].length>j;j++){
                if(array[i][j]==element){
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[]{-1,-1};
    }
}
