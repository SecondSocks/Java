package CollectionLearn.QueueCollections;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeLearn {
    public static void main(String[] args) {

    }

    private static void queueMethods() {
        Queue<Integer> integerQueue = new ArrayDeque<>();

        // offer(object) - добавляет элемент, возвращая true/false
        boolean successAdd = integerQueue.offer(1);
        System.out.println(successAdd);

        // element() - возвращает первый элемент из начала очереди.
        try {
            int num = integerQueue.element();
            System.out.println(num);
        } catch (NoSuchElementException e) {
            System.out.println("В очереди нет элементов");
        }

        // peek() - возвращает первый элемент без удаления. При отсутсвии выдает null
        System.out.println(integerQueue.peek());

        // poll() - возвращает и удаляет первый элемент. При отстствии выдает null
        integerQueue.offer(2);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.peek());

        // remove() - возвращает и удаляет первый элемент.
        try {
            integerQueue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Очередь пуста");
        }
    }

    private static void dequeMethods() {
        Deque<Integer> integerDeque = new ArrayDeque<>();

        // addFirst(object) - добавляет в начало очереди
        integerDeque.addFirst(1);

        // addLast(object) - добавляет в конце очереди
        integerDeque.addLast(0);

        // getFirst() - возвращает первый элемент
        try {
            int n = integerDeque.getFirst();
        } catch (NoSuchElementException e) {
            System.out.println("Очередь пуста");
        }

        // getLast() - возвращает послдений элемент
        try {
            int n = integerDeque.getLast();
            System.out.println(n);
        } catch (NoSuchElementException e) {
            System.out.println("В очереди нет элементов");
        }

        // offerFirst(object) - добавляет элемент в начало очереди и возвращает true/false
        boolean successAdd = integerDeque.offerFirst(31);
        System.out.println(successAdd);

        // offerLast(object) - добавляет элемент в конец очереди и возвращает true/false
        boolean successAdd2 = integerDeque.offerLast(12);
        System.out.println(successAdd2);

        // peekFirst() - возвращает первый элемент без удаления. При отсутствии возвращает null
        System.out.println(integerDeque.peekFirst());

        // peekLast() - возвращает последний элемент без удаления. При отсутсвии возвращает null
        System.out.println(integerDeque.peekLast());

        // pollFist() - возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        System.out.println(integerDeque.pollFirst());

        // pollLast() - возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null
        System.out.println(integerDeque.pollLast());

        // pop() - возвращает с удалением элемент из начала очереди.
        try {
            System.out.println(integerDeque.pop());
        } catch (NoSuchElementException e) {
            System.out.println("Очередь пуста");
        }

        // push(object) - добавляет элемент в самое начало очереди
        integerDeque.push(30);
        System.out.println(integerDeque.peekFirst());

        // removeFirst() - возвращает с удалением элемент из начала очереди.
        try {
            System.out.println(integerDeque.removeFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Очередь пуста");
        }

        // removeLast() - возвращает с удалением элемент из конца очереди.
        try {
            System.out.println(integerDeque.removeFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Очередь пуста");
        }

        // removeFirstOccurrence(object) - удаляет первый встреченный элемент obj из очереди.
        boolean successRemove = integerDeque.removeFirstOccurrence(12);
        System.out.println(successRemove);

        // removeLastOccurrence(object) - удаляет последний встреченный элемент obj из очереди.
        boolean successRemove2 = integerDeque.removeLastOccurrence(12);
        System.out.println(successRemove2);
    }

    private static void arrayDequeMethods() {
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();  // Queue + Deque + Collections

        // add(object) - стандартное добавление элементов
        integerArrayDeque.add(1);

        // addFirst(object) - добавляем элемент в самое начало
        integerArrayDeque.addFirst(2);

        // push(object) - добавляем элемент в самое начало
        integerArrayDeque.push(3);

        // addLast(object) - добавляем элемент в конец коллекции
        integerArrayDeque.addLast(0);

        for (int i : integerArrayDeque) {
            System.out.print(i + " ");
        }

        // getFirst() - получаем первый элемент без удаления
        System.out.println(integerArrayDeque.getFirst());

        // getLast() - получаем последний элемент без удаления
        System.out.println(integerArrayDeque.getLast());

    }
}
