public class BinarySearch {

    static int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate arr mid index

            // Check x is midpoint
            if (arr[mid] == x)
                return mid;

            // If x greater, discard left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, discard right half
            else
                high = mid - 1;
        }

        return -1; // Element not found
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 6, 7 }; // This has to be a sorted list !!!!
        int x = 7;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element not found");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
