package chapters.chapters_10.Exercises.Exercise_10;

public class Queue {
    private int[] elements;
    private int size;


    public Queue() {
        elements = new int[8];
        size = 0;// counts the number of elements in the queue
    }

    public void enqueue(int v) {
        // If the size exceeds the capacity doubled the capacity
        if (size >= elements.length) {
            int[] tempElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, tempElements, 0, elements.length);
            elements = tempElements;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int n = elements[0];
        // Shifts the queue by one to left
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return n;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
