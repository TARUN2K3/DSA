public class Find_minimum_No {
    public static void main(String[] args) {
        int arr[] = {10, 234, 56, 67, 7, 8, 9,};
        int ans  = Find_minimum_No(arr);
        System.out.println(ans);
    }
    static int Find_minimum_No(int[] array){
        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }return min;
    }
}
