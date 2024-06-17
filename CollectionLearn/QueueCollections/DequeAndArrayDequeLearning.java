/*Deque - коллекция, определяющая интерфейс двунаправленной очереди. В этой коллекции мы можем работать с началом и
* концом очереди. Можно реализовывать как правило FIFO, так и правило LIFO (Last In - First Out). Интерфейс Deque
* реализуется классами LinkedList и ArrayDeque*/
package CollectionLearn.QueueCollections;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeAndArrayDequeLearning {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(7);
        deque.offerLast(0);
        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        deque.addFirst(10);
        deque.addLast(22);
        deque.offerFirst(71);
        deque.offerLast(30);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        /*Разница между peek и get: при использовании get() на пустую очередь, выбрасывается исключение, а при использовании
        * peek() возвращается null*/
    }
}
