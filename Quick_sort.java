class quick_sort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        // Call quick_sort function to sort the array
        quick_sort(arr, 0, arr.length - 1);
        
        // Print the sorted array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Quick Sort function
    static void quick_sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        
        // Partition the array and get the pivot index
        int i = start;
        int j = end;
        int pivot = arr[start + (end - start) / 2]; // Using the middle element as the pivot
        
        while (i <= j) {
            // Find an element larger than the pivot from the left side
            while (arr[i] < pivot) {
                i++;
            }
            // Find an element smaller than the pivot from the right side
            while (arr[j] > pivot) {
                j--;
            }
            // Swap elements if out of order
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        // Recursively sort the left and right halves
        quick_sort(arr, start, j);
        quick_sort(arr, i, end);
    }
}
