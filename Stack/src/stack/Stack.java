package stack;

public class Stack {

    private int[] stackElements;
    private int top;
    private final int size;

    public Stack(int size) {
        this.size = size;
        stackElements = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;

    }

    public void push(int elements) {
        if (top == size - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackElements[++top] = elements;
    }

    public int pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty");
        }
        return stackElements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackElements[top];

    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        top = - 1;
    }

    public int search(int value) {
        for (int count = top; count >= 0; count--) {
            if (stackElements[count] == value) {
                return top - count + 1;

            }

        }
        return -1;
    }

    public boolean contains(int value) {
        for (int count = 0; count <= top; count++) {
            if (stackElements[count] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        System.out.println("Peek "+ stack.peek());
        System.out.println("pop "+ stack.pop());
        System.out.println("con "+ stack.contains(1));
        System.out.println("search "+ stack.search(1));
        System.out.println("size "+ stack.size());
        stack.clear();


    }
}
