package basic.recursion;

public class recursionalgo {

    public static void main(String[] args) {


        System.out.println(factorialrecursion(5));
    }

    public static int factorialrecursion(int arg) {
        if (arg < 1) return 1;
        return arg * factorialrecursion(arg - 1);
    }


}
