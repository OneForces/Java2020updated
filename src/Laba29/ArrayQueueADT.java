package Laba29;

public class ArrayQueueADT {
    private int head;
    private int tail;
    private int size;
    private Object[] elements = new Object[10];


    public Object element(ArrayQueueADT queue){
        assert queue.size > 0;
        return queue.elements[head];
    }

    public  void enqueue(ArrayQueueADT queue, Object element){
        queue.fixCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public Object dequeue(ArrayQueueADT queue){
        Object element = queue.elements[head];
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    public boolean isEmpty(ArrayQueueADT queue){
        return queue.size == 0;
    }

    public void clear(ArrayQueueADT queue){
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }

    public int size(ArrayQueueADT queue){
        return queue.size;
    }

    private void fixCapacity(ArrayQueueADT queue, int capasity){
        if (capasity < queue.elements.length){
            return;
        }

        Object[] copy = new Object[capasity * 2];
        int i = 0;
        while(queue.head != queue.tail){
            copy[i] = queue.elements[head];
            queue.head = (queue.head + 1) % queue.elements.length;
            i++;
        }
        queue.head = 0;
        queue.tail = queue.elements.length - 1;
        queue.elements = copy;
    }


}