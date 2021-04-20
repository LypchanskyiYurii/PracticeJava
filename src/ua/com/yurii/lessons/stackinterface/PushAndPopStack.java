package ua.com.yurii.lessons.stackinterface;

import java.util.Stack;

public class PushAndPopStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek());
        System.out.println("_____________________");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

}
