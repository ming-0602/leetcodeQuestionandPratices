package basic.sort;

public class linersortalgo {
    public static void main(String[] args) {
        int[] arr = {9, 8, 2, 3, 1, 7, 6, 5, 10, 4};
        linersort(arr);
    }

    public static void linersort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            // Place the key in its correct position
            array[j + 1] = key;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
