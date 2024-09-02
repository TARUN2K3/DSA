public class Binary_Search_Recursion {
    public static void main(String[] args) {
        int[] arr = {23, 43, 65, 78 ,81, 91, 93, 94, 99};
        int target = 78;
        int result = Binary_Search(arr, target, 0, arr.length-1);
        System.out.println(result);
    }
    static int Binary_Search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }else if(target>arr[mid]){
            return Binary_Search(arr, target, mid+1, end);
        }else{
            return Binary_Search(arr, target, start, mid-1);
        }
    }
}
