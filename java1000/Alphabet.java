package java1000;

import java.util.Scanner;
import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alphabet = getAlphabetList();

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] letters = str.split("");

        int[] indexes = new int[26];
        for (int i = 0; i < letters.length; i++) {
            indexes[i] = alphabet.indexOf(letters[i]);
        }

        boolean ans = true;
        for (int i = 0; i < indexes.length-1; i++) {
            if (indexes[i] == indexes[i+1]) {
                ans = false;
                break;
            }
        }
        if (ans) {
            System.out.println("YES");
            for (int i : indexes) {
                System.out.printf("%d ", i+1);
            }
        } else {
            System.out.println("NO");
        }
    }

    private static ArrayList<String> getAlphabetList() {
        ArrayList<String> alphabet = new ArrayList<>();
        String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (String s : alphabets) {
            alphabet.add(s);
        }
        return alphabet;
    }
}

