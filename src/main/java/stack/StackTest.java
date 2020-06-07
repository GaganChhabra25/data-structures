package stack;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private datastructures.stack.StackOperations stackOperations;

    @Before
    public void setup() {
        stackOperations = new stack.StackOperationsImpl();
    }

    @Test
    public void test_push() {
        System.out.println("Stack before adding element ");
        System.out.println(stackOperations.getStack());
        stackOperations.push(20);
        stackOperations.push(30);
        stackOperations.push(40);
        stackOperations.push(50);
        stackOperations.push(60);
        System.out.println("Peek from stack " +  stackOperations.peek());

    }
}
