public class Stack {
    private int[] elements;
    private int top;

    public Stack(int capacity) {
        elements = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == elements.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        elements[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; 
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
