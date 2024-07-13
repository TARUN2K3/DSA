public class Linear_search {
    public static void main(String[] args) {
        int arr[]={1, 34, 5, 2,2, 1, 2, 3, 453, 45, 6, 78};
        int find = 453;
        int ans = search(arr, find);
        System.out.println(ans);
    }
    static int search(int array[],int target){
        if(array.length==0){
            return -1;
        }
        for(int i = 0;array.length>i;i++){
            if(array[i]==target){
                return i;
            }
        }return -1;
    }

}
