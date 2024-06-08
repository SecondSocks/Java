/*(Не синхронизирован) Queue - очередь элементов для обработки. Используется для операций с самым первым в очереди
* элементом. Реализует правило FIFO (First In - First Out). Элементы добавляются в конец очереди*/
/*LinkedList наследует не только класс Queue, но и Deque*/
package CollectionLearn.QueueCollections;

import org.w3c.dom.ls.LSOutput;

import java.util.Queue;
import java.util.LinkedList;

public class QueueAndLinkedListLearning {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Phillip");  // Первый в очереди, т.к. индекс = 0
        queue.add("Kumar");
        queue.add("Mary");
        queue.offer("Bob");
        queue.offer("Jack");
        System.out.println(queue);
        /*Разница между add и offer в том, что при добавлении в переполненную очередь через add, выбрасывается исключение,
        * а при добавлении через offer, элемент просто не добавится.*/
        System.out.println(queue.remove("Kumar"));
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        /*Разница между poll и remove: при использовании remove() на пустой список, выбрасывается исключение, а при
        * использовании poll - нет*/

        System.out.println(queue.element());  // Показывается первый элемент в очереди
        System.out.println(queue.peek());  // Показывается первый элемент в очереди
        /*Разница между element и peek: при использовании element() на пустую очередь, выбрасывается исключение, а при
        * использовании peek() возвращается null*/
    }
}
