package basic.search;

public class binarysearchalgo {

    public static void main(String[] args) {

        //need to be sorted array
        //cut in half to see biger or lesser
        //then find, repeat process if cut in half didn't find it

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int index = binarysearch(array, 8);

        System.out.println(index);

    }

    public static int binarysearch(int[] arr, int target) {

        int min = 0, max = arr.length-1;

        while (min <= max) {
            int mid = (min + max) / 2;//9/2 = 4 take the small number //14/2 = 7
            System.out.println("origin" + mid);
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                min = mid + 1;
                System.out.println("min" + min);
            }else {
                max = mid - 1;
                System.out.println("max" + max);
            }
        }

        return -1;
    }
}
