package Laba29;

public class ArrayQueueModule {
    private static int head;
    private static int tail;
    private static int size;
    private static Object[] elements = new Object[10];


    public static Object element(){
        return elements[head];
    }

    public static void enqueue(Object element){
        fixCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object dequeue(){
        Object element = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public static boolean isEmpty(){
        return size == 0;
    }

    public static void clear(){
        head = 0;
        tail = 0;
        size = 0;
    }

    public static int size(){
        return size;
    }

    private static void fixCapacity(int capasity){
        if (capasity < elements.length){
            return;
        }

        Object[] copy = new Object[capasity * 2];
        int i = 0;
        while(head != tail){
            copy[i] = elements[head];
            head = (head + 1) % elements.length;
            i++;
        }
        head = 0;
        tail = elements.length - 1;
        elements = copy;

    }


}