public class Floor_of_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 13;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] array ,int element){
        int start = 0;
        int end = array.length-1;

        if(element>array[end]){
            return -1;
        }

        while (start<=end) {
            int mid = start + (end - start) / 2;

            if(element<array[mid]){
                end = mid - 1;
            }
            else if(element>array[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return array[end];
    }

}
