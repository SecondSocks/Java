/*PriorityQueue - вид очереди, в которой используется натуральная сортировка, или та, которую мы прописываем с помощью
* Comparable или Comparator. Таким образом используется тот элемент, приоритет которого выше (наименьший элемент).
* Принцип сортировки схож с TreeMap*/
package CollectionLearn.QueueCollections;

import java.util.PriorityQueue;

public class PriorityQueueLearning {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(3);
        priorityQueue.add(14);
        priorityQueue.add(9);
        System.out.println(priorityQueue.peek());  // При использовании элементов принцип естественной сортировки есть
        System.out.println(priorityQueue);  // При выводе очереди используется метод сортировки красно-черного дерева

        test();
    }

    private static void test() {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        Student student1 = new Student("Frank", 2);
        Student student2 = new Student("Larry", 1);
        Student student3 = new Student("Garry", 3);
        Student student4 = new Student("Hank", 4);

        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
