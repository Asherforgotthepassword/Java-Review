class InsertionSort {
    // Insertion sorting algorithm
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) { // Stop check before negative indexes
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Lock in key at its correct position
        }
    }

    // Print array function
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 82, 9, 1, 100, 90 };

        InsertionSort ob = new InsertionSort();
        System.out.print("OG array: ");
        printArray(arr);


        ob.sort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
