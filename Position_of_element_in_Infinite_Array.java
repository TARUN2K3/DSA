public class Position_of_element_in_Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60};
        int target = 10;
        int answer = ans(arr,target);
        System.out.println(answer);
    }
    static int ans(int[] array, int element){
        int start = 0;
        int end = 1;

        while(element>array[end]){
            int temp = end+1;   
            end = end+(end-start+1)*2;
            start = temp;
        }
        return search(array, element, start, end);
    }
    static int search(int[] array, int element,int start, int end){
        while (start<=end) {
            int mid = start+(end-start)/2;
            
            if(element<array[mid]){
                end = mid-1;
            }else if(element>array[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }return -1;
    }
}