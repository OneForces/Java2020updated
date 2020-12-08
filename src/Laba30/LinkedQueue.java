package Laba30;

import java.util.LinkedList;

public class LinkedQueue<E> extends AbstractQueue<E> {
    LinkedList<E> queue;

    public LinkedQueue() {
        this.queue = new LinkedList<>();
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
    public int size(){
        return queue.size();
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "queue=" + queue +
                '}';
    }
}