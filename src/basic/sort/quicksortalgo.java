package basic.sort;

public class quicksortalgo {
    //use pivot to compare split array to left and right
    //then use left and right array does individually
    public static void main(String[] args) {
        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        quicksort(array, 0, array.length - 1);

        // Print sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the left and right subarrays
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the last element as the pivot
        int pivot = array[high];
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the partition index
    }
}
