package Laba23;

public class AnyType <T> {
    private T []arr;

    public void setArr(T[] arr) {
        this.arr = arr;
    }
    public T getElementIndex(int i){
        return arr[i];
    }
}
