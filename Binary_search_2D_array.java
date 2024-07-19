import java.util.Arrays;

public class Binary_search_2D_array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{11,12,13,14},{21,22,23,24},{31,32,33,34}};
        System.out.println(Arrays.toString(search(arr, 12)));
        
    }static int[] search(int[][] array, int target){
        int row = 0;
        int column = array.length-1;

        while (row<array.length && column>=0) {
            if(target<array[row][column]){
                column--;
            }else if(target>array[row][column]){
                row++;
            }else{
                return new int[]{row,column};
            }
        }
        return new int[]{-1,-1};
    }
}
