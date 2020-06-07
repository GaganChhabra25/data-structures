package datastructures.stack;

public interface StackOperations {
    void push(int element);
    void  pop();
    int peek();
    boolean isFull();
    boolean isEmpty();
    String getStack();
}
