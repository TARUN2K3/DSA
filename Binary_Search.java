
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int target = 1;
        int ans = search(arr, target);
        System.out.println(ans);
    }static int search(int[] array,int element){
        int n = array.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start-(start-end)/2;
            if(element<array[mid]){
                end = mid-1;
            }else if(element>array[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}