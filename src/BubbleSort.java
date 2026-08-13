public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // iterate thru array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // swap if current element is > next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if absolutely no swapping occurred
          //array is alr sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Input array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        bubbleSort(arr);
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
