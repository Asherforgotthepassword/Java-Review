class LinearSearch {

    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 76, 8, 23, 100, 101};
        int index = search(arr, 76);
        int index2 = search(arr, 50);
        System.out.println("76 is at index " + index);
        System.out.println("50 is at index " + index2);
    }
}
