/*(Синхронизирован) Stack наследует Vector. Использует принцип LIFO (Last In First Out). Не рекомендуется использовать.*/
package CollectionLearn.ListCollections;

import java.util.Stack;

public class StackLearn {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack = stackFill(stack);

        System.out.println(stack);  // Georgy - верхний элемент (Представьте тарелки)
        System.out.println(stack.pop());  // Удаляет верхний элемент
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        } // В конце стэк полностью пуст

        stack = stackFill(stack);
        System.out.println(stack.peek());  // Посмотреть верхний элемент
        System.out.println(stack);
    }

    private static Stack<String> stackFill(Stack<String> stack) {
        stack.push("Bobby");
        stack.push("Alice");
        stack.push("Ryan");
        stack.push("Georgy");
        return stack;
    }
}
