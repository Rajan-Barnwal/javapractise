public class ResizableStack extends Stack {
    public ResizableStack(int capacity) {
        super(capacity);
    }

    @Override
    public void push(int element) {
        if (top == elements.length - 1) {
            int[] newElements = new int[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        super.push(element);
    }

    public int capacity() {
        return elements.length;
    }
    
    public void resize(int newCapacity) {
        if (newCapacity < elements.length) {
            System.out.println("New capacity must be greater than current capacity");
            return;
        }
        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
