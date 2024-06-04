package CollectionLearn;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
import java.util.LinkedList;

public class ListIteratorLearn {
    public static void main(String[] args) {
        // Palindrome
        String word = "мадам";
        List<Character> list = new LinkedList<>();

        for (char c : word.toCharArray()) {  // toCharArray -> Character[]
            list.add(c);
        }

        System.out.println(list);

        ListIterator<Character> listIterator = list.listIterator();  // Идем с первого элемента
        ListIterator<Character> reverseIterator = list.listIterator(list.size());  // Идем с последнего элемента
        boolean isPalindrome = true;
        while (listIterator.hasNext() && reverseIterator.hasPrevious()) {  // LI идет вперед, а RI идет назад
            if (listIterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
