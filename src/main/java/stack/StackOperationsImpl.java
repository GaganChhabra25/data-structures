package datastructures.stack;

import java.util.Arrays;

/*
Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
Peek or Top: Returns top element of stack.
isEmpty: Returns true if stack is empty, else false
*/
public class StackOperationsImpl implements datastructures.stack.StackOperations {

    private static int top = -1;
    private static int[] array = new int[5];

    @Override
    public void push(int element){
        System.out.println("====Adding element =====" +  element);
        if(!isFull()){
            array[top+1] = element;
            top++;
        } else {
            System.out.println("Stack is full. No space to insert new element : " +  element);
        }
        System.out.println(" After adding " + getStack());
    }

    /* Remove */
    @Override
    public void  pop() {
        System.out.println("=====Deleting top element=====");
        if(!isEmpty()) {
            array[top] = 0;
            top--;
        } else {
            System.out.println("Stack is empty, nothing to delete");
        }
        System.out.println("Stack : " + getStack());
    }

    @Override
    public int peek() {
        if(!isEmpty()) {
            return array[top];
        }else {
            return -1;
        }
    }

    @Override
    public boolean isFull() {
        return top == array.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String getStack() {
        return Arrays.toString(array);
    }
}
