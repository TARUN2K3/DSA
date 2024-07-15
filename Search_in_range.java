public class Search_in_range {
    public static void main(String[] args) {
        int arr[] = {1, 234, 56, 67, 7, 8, 9,};
        int inital = 1;
        int last = 5;
        int element = 67;
        int ans = search(arr, inital, last, element);
        System.err.println(ans);
    }
    static Integer search(int[] array, int first, int last, int e){
        for(int i = first; last>i;i++){
            if(e == array[i]){
                return i;
            }
        }
        return -1;
    }
    
}