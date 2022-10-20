/**
 * This class implements a Stack using a regular array.
**/
public class StackArray {
    public static void main(String[] args) {
        StackArray myStackArray = new StackArray(4);

        assert myStackArray.isEmpty();
        assert !myStackArray.isFull();

        myStackArray.push(5);
        myStackArray.push(8);
        myStackArray.push(2);
        myStackArray.push(9);

        assert !myStackArray.isEmpty();
        assert myStackArray.isFull();
        assert myStackArray.peek() == 9;
        assert myStackArray.pop() == 9;
        assert myStackArray.peek() == 2;
        assert myStackArray.size() == 3;
    }

    private static final int DEFAULT_CAPACITY = 10;

    private int maxSize;

    private int[] stackArray;

    private int top;

    public StackArray() {
        this(DEFAULT_CAPACITY);
    }

    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (!isFull()) { // Checks for a full stack
            top++;
            stackArray[top] = value;
        } else {
            resize(maxSize * 2);
            push(value); // don't forget push after resizing
        }
    }

    public int pop() {
        if (!isEmpty()) { // Checks for an empty stack
            return stackArray[top--];
        }

        if (top < maxSize / 4) {
            resize(maxSize / 2);
            return pop(); // don't forget pop after resizing
        } else {
            System.out.println("The stack is already empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) { // Checks for an empty stack
            return stackArray[top];
        } else {
            System.out.println("The stack is empty, cant peek");
            return -1;
        }
    }

    private void resize(int newSize) {
        int[] transferArray = new int[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
        }
        // This reference change might be nice in here
        stackArray = transferArray;
        maxSize = newSize;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top + 1 == maxSize);
    }

    public void makeEmpty() {
        top = -1;
    }

    public int size() {
        return top + 1;
    }
}
