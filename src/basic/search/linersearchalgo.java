package basic.search;

public class linersearchalgo {

    public static void main(String[] args) {

        //iterate through from start to end to find it

        int[] array = {9, 8, 2, 7, 3, 1, 6, 4, 5};

        int index = linersearch(array, 1);

        System.out.println(index);

    }

    public static int linersearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
