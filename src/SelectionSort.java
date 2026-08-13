class SelectionSort {
    // Selection sort algorithm
    void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds the min element
            int min_idx = i;

            // Iterate through unsorted portion to find its minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {

                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }

            // Move minimum element to its correct position through swap
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    // Print array function
    static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] arr = { 87, 91, 1, 4, 7 };
        SelectionSort ss = new SelectionSort();

        System.out.print("OG array: ");
        printArray(arr);

        ss.selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}

