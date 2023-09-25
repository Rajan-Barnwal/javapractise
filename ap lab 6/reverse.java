public void reverse() {
    int[] reversed = new int[elements.length];
    int index = 0;
    while (!isEmpty()) {
        reversed[index++] = pop();
    }
    elements = reversed;
    top = index - 1;
}
