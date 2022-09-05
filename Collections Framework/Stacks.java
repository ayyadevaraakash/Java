// Stack is not prefered. Instead use ArrayDeque

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(5);
        myStack.push(8);
        myStack.push(12);

        System.out.println("Before pop: " + myStack);

        // LIFO strategy

        myStack.pop();

        System.out.println("After pop: " + myStack);

        System.out.println("Topmost element: " + myStack.peek());

    }
}
