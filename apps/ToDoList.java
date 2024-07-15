// TODO: разработать систему сохранения списка через файл. При открытии он будет считываться, а при выходе - записываться
// TODO: создать обоаботчик данных в классе ToDo
package apps;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDo toDo = new ToDo();

        System.out.println("Welcome to ToDoList");
        System.out.println("List of commands: ADD, REMOVE, SHOW, EDIT, EXIT");
        System.out.println("Example, how add record: \"ADD Wash the car\"");
        System.out.println("How remove the record: \"REMOVE 1\" or \"REMOVE Wash the car\" ");
        System.out.println("How edit the record: \"EDIT 2 Wash the dish\"");
        System.out.println("How show all records: \"SHOW\"");

        while (true) {
            System.out.print("Enter the command: ");
            String command = scanner.nextLine();
            String[] words = command.split(" ");

            for (int i = 0; i < words.length; i++) {
                if (words[0].equalsIgnoreCase("ADD") && words.length == 2) {
                    toDo.add(words[1]);
                    break;
                } else if (words[0].equalsIgnoreCase("ADD") && words.length > 2) {
                    String text = new String();
                    for (int j = 1; j < words.length; j++) {
                        text += words[j] + " ";
                    }
                    toDo.add(text);
                    break;
                } else if (words[0].equalsIgnoreCase("REMOVE") && words.length == 2) {
                    try {
                        int index = Integer.parseInt(words[1]) - 1;
                        toDo.remove(index);
                    } catch (Exception e) {
                        toDo.remove(words[1]);
                    }
                    break;
                } else if (words[0].equalsIgnoreCase("REMOVE") && words.length > 2) {
                    String text = new String();
                    for (int j = 1; j < words.length; j++) {
                        text += words[j] + " ";
                    }
                    toDo.remove(text);
                    break;
                } else if (words[0].equalsIgnoreCase("SHOW")) {
                    toDo.showAll();
                    break;
                } else if (words[0].equalsIgnoreCase("EDIT") && words.length == 3) {
                    toDo.edit(Integer.parseInt(words[1]) - 1, words[2]);
                    break;
                } else if (words[0].equalsIgnoreCase("EDIT") && words.length > 3) {
                    String text = new String();
                    for (int j = 2; j < words.length; j++) {
                        text += words[j] + " ";
                    }
                    toDo.edit(Integer.parseInt(words[1]) - 1, text);
                    break;
                }
            }

            if (words[0].equalsIgnoreCase("EXIT")) {
                break;
            }
        }
    }
}

class ToDo {
    private LinkedList<String> list = new LinkedList<>();

    public ToDo() {}

    public void add(String item) {
        list.add(item);
    }

    public void add(int index, String item) {
        list.add(index, item);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void remove(String item) {
        list.remove(item);
    }

    public void showAll() {
        for (String elem : list) {
            System.out.printf("%d. %s\n", list.indexOf(elem) + 1, elem);
        }
    }

    public void edit(int index, String item) {
        list.set(index, item);
    }
}