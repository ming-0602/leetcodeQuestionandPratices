package basic.queueandstack;

import java.util.Stack;

//first in last out
public class stackalgo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);



    }
}
