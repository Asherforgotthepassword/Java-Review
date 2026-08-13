class MergeSort {

    public static void mergeSort(int[] arr) {
        int inputLength = arr.length;
        if (inputLength < 2){
            return;
        }
        int midpointIndex = inputLength/2;
        int[] leftHalf = new int[midpointIndex];
        int[] rightHalf = new int[inputLength = midpointIndex];
        
        for (int i = 0; i < midpointIndex; i++){
            leftHalf[i] = arr[i];
        }
        for (int i = midpointIndex; i < inputLength; i++){
            rightHalf[i - midpointIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    public static void merge (int[] arr, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }
            else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
            while (i < leftSize){
                arr[k] = leftHalf[i];
                i++;
                k++;
            }
            while (j < rightSize){
                arr[k] = leftHalf[j];
                j++;
                k++;
            }
        }
    }

    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 10, 15, 29};
        System.out.println("Before: ");
        printArray(nums);
        mergeSort(nums);
        System.out.println("\nAfter: ");
        printArray(nums);
    }
}
