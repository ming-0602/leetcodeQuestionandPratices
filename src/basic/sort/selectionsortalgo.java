package basic.sort;

public class selectionsortalgo {

    public static void main(String[] args) {

        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5};

        selectionsort(array);

    }

    //compare the value with next value is smaller sort then repeart the process till everything sorted

    public static void selectionsort(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if ( array[min] > array[j] ) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
