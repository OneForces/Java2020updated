package Laba29;

public class ArrayQueue {
    private int head;
    private int tail;
    private int size;
    private Object[] elements = new Object[10];


    public Object element(){
        assert size > 0;
        return elements[head];
    }

    public  void enqueue(Object element){
        assert element != null;
        fixCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object dequeu(){
        Object element = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        head = 0;
        tail = 0;
        size = 0;
    }

    public int size(){
        return size;
    }

    private void fixCapacity(int capasity){
        if (capasity < elements.length){
            return;
        }

        Object[] copy = new Object[elements.length * 2];
        int i = 0;
        while(head != tail){
            copy[i] = elements[head];
            head = (head + 1) % elements.length;
            i++;
        }
        tail = elements.length - 1;
        elements = copy;
        head = 0;

    }


}
