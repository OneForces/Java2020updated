package Laba30;

public class Main {


    public static void main(String[] args) {

        System.out.println("AQ");
        Queue<Integer> queueArr = new ArrayQueue<>();
        for (int i = 0; i < 5; i++){
            queueArr.offer(i+1);
        }
        System.out.println(queueArr.poll());
        System.out.println(queueArr.element());
        System.out.println(queueArr);

        System.out.println("LQ");
        Queue<String> queueLinked = new LinkedQueue<>();
        for (int i = 0; i < 5; i++){
            queueLinked.offer("Test" + i);
        }
        System.out.println(queueLinked.poll());
        System.out.println(queueLinked.element());
        System.out.println(queueLinked);

    }
}