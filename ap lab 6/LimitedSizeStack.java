public class LimitedSizeStack extends Stack {
    private int maxSize;

    public LimitedSizeStack(int capacity, int maxSize) {
        super(capacity);
        this.maxSize = maxSize;
    }

    @Override
    public void push(int element) {
        while (top >= maxSize - 1) {
            pop(); 
        }
        super.push(element);
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
