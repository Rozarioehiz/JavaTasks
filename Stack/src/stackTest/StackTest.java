package stackTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
//    private Stack stack;

//    @BeforeEach
//    public void setUp() {
//        stack = new MyStack(10);
//    }


    @Test
    public void testThatStackIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void testThatStackIsNotEmptyAfterPush() {
        Stack stack = new Stack();
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStackThrowExceptionOnPopIfStackIsEmpty() {
        Stack stack = new Stack();
        assertThrows(StackOverflowError.class, () -> stack.pop());
    }

    @Test
    public void testThatStackThrowExceptionOnPeekIfStackIsNotEmpty() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> stack.peek());

    }

    @Test
    public void testForPushAndPopFunctionality() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
    }

    @Test
    public void checkForStackSizePushAndPop() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void checkForClearMethod() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.clear();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void checkForSearchMethod() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(3, stack.search(5));
        assertEquals(1, stack.search(7));
        assertEquals(2, stack.search(6));
    }

    @Test
    public void checkForContainsMethod() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        assertTrue(stack.contains(5));
        assertTrue(stack.contains(6));
    }

}