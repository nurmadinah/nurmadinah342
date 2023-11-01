
import java.util.LinkedList;
import java.util.Queue;

public class queuepoll {
    public static void main(String[] args) {
        Queue<Double> myQueue = new LinkedList<>();
        myQueue.offer(14.32);
        myQueue.offer(22.30);
        double value = myQueue.poll();
        System.out.println("POLL" + value);
        System.out.println(myQueue);

    }
}
