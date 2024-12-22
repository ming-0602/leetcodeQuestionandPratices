package basic.sort;

public class insertionsortalgo {

    public static void main(String[] args) {

        //time complexity is the 2 time of the array

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5};

        insertionsort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertionsort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
