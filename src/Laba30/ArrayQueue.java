package Laba30;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayQueue<E> extends AbstractQueue<E> {
    ArrayList<E> queue;
    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    protected int size() {
        return queue.size();
    }

    @Override
    public E poll() {
        if (queue == null){
            return null;
        }
        E element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public E peek() {
        if (queue == null){
            return null;
        }
        return queue.get(0);
    }

    @Override
    public boolean offer(E element) {
        return queue.add(element);
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + queue +
                '}';
    }
}