public class DividenConquer {

    // -----------Merge_Sort--------------
    // public static void printArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    // public static void mergeSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // int mid = si + (ei - si) / 2; // (si+ei)/2
    // mergeSort(arr, si, mid); // left part
    // mergeSort(arr, mid + 1, ei); // right part
    // merge(arr, si, mid, ei);
    // }

    // public static void merge(int arr[], int si, int mid, int ei) {
    // int temp[] = new int[ei - si + 1];
    // int i = si; // iterator for left part
    // int j = mid + 1; // iterator for right part
    // int k = 0; // iterator for temp Arr

    // while (i <= mid && j <= ei) {
    // if (arr[i] < arr[j]) {
    // temp[k++] = arr[i++];
    // } else {
    // temp[k++] = arr[j++];
    // }
    // }

    // // Copy remaining elements of the left part
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }

    // // Copy remaining elements of the right part
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }

    // // Copy temp array back to original array
    // for (k = 0, i = si; k < temp.length; k++, i++) {
    // arr[i] = temp[k]; // **Fix: Use temp[k] instead of arr[k]**
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 6, 3, 9, 5, 2, 8 };
    // System.out.println("Original Array:");
    // printArr(arr);

    // mergeSort(arr, 0, arr.length - 1);

    // System.out.println("Sorted Array:");
    // printArr(arr);
    // }

    // --------------Quick_Sort--------------

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) { // base case
            return;
        }

        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // Sort left part
        quickSort(arr, pIdx + 1, ei); // Sort right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Last element as pivot
        int i = si - 1; // to make place for elm smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) { // Swap if element is smaller than pivot
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
