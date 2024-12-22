package basic.sort;

public class mergesortalgo {

    public static void main(String[] args) {
        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        mergesort(array);

        // Print sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mergesort(int[] array) {
        int length = array.length;

        if (length <= 1) {
            return; // Base case: a single element is already sorted
        }

        int mid = length / 2;

        // Split the array into two halves
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        // Copy elements to left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = array[i];
        }

        // Recursively sort both halves
        mergesort(left);
        mergesort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int leftsize = left.length;
        int rightsize = right.length;

        int i = 0, j = 0, k = 0;

        // Merge elements from left and right arrays
        while (i < leftsize && j < rightsize) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < leftsize) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right array
        while (j < rightsize) {
            array[k++] = right[j++];
        }
    }
}
