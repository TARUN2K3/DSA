import java.util.Arrays;
class Merge_sort {
    public static void main(String[] args) {
         int[] arr = {38, 27, 43, 3, 9, 82, 10};
         int[] result = merge_sort(arr);
          System.out.println("Sorted Array: " + Arrays.toString(result));
    }static int[] merge_sort(int[] arr){
        if(arr.length==1){
            return arr;
        }else{
            int mid = arr.length/2;
            
            int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
            int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
            
            return merge(left,right);
        } 
    }static int[] merge(int[] left, int[] right){
            int[] mix = new int[left.length+right.length];
            
            int i = 0;
            int j = 0;
            int k = 0;
            
            while(i<left.length && j<right.length){
                if(left[i]<right[j]){
                    mix[k] = left[i];
                    i++;
                }else{
                    mix[k] = right[j];
                    j++;
                }
                k++;
            }while(i<left.length){
                mix[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                mix[k]=right[j];
                j++;
                k++;
            }return mix;
        }
}