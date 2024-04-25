// 8. Program to create a generic stack and do the Push and Pop operations.

import java.util.Stack;


public class GenericStack<T> {
    
    public static void main(String[] args) {
        
        GStack<Integer> stack = new GStack<>();

        stack.push(10);
        stack.display();
        stack.push(20);
        stack.display();
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();

    }

}

class GStack<T> {
    
    private Stack<T> stack;

    public GStack() {
        stack = new Stack<>();
    }

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        return stack.pop();
    }

    public void display() {
        stack.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }

}
