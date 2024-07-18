public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] array, int element){
        int start = 0;
        int end = array.length-1;

        boolean isascending = array[start]<array[end];
        while (start<=end) {
            int mid = start - (start-end)/2;

            if(array[mid]==element){
                return mid;
            }
            if(isascending){
                if(element<array[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(element<array[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
