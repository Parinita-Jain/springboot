import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(89);
        queue.add(27);
        queue.add(67);
        queue.add(54);
        queue.add(27);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);
    }
}
