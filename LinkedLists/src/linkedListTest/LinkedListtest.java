package linkedListTest;

import linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListtest {


    @Test
    public void testThatANodeCreatedIsEmpty() {
        LinkedList linked = new LinkedList();

        assertNull(linked .getHead());
        assertEquals(0, linked .getSize());
    }

    @Test
    public void testThatANodeCanBeAddedToALinkedList() {
        LinkedList linked = new LinkedList();
        linked .append(10);
        assertEquals(1, linked .getSize());
        assertEquals(10, linked .getHead().data);

    }

    @Test
    public void testThatICanPrependANodeToTheHeadOfTheList() {
        LinkedList linked = new LinkedList();

        linked .append(10);
        linked .append(20);
        linked .add(30);
        assertEquals(3, linked .getSize());
        assertEquals(30, linked .getHead().data);

    }

    @Test
    public void testThatICanPrependANodeToAListWithNoNode() {
        LinkedList linked = new LinkedList();
        linked .add(10);
        assertEquals(1, linked .getSize());
        assertEquals(10, linked .getHead().data);

    }

    @Test
    public void testThatICanInsertANodeInASpecifiedPositionOfAList() {
        LinkedList linked = new LinkedList();
        linked .append(20);
        linked .append(15);
        linked .append(10);
        linked .insertAt(5, 1);
        assertEquals(4, linked .getSize());
// Extra check to verify it actually went to position 1
        assertEquals(5, linked .getHead().next.data);

    }

}