/*Поиск Binary Search начинается с середины, деля список\массив на 2 равные части.
* Когда начинается поиск, Binary Search сравнивает элемент по средине с тем, который мы ищем.
* Если он меньше, то поиск происходит только во 2 массиве\списке, если меньше, то в 1.
* После этого выбранный массив\список также делится пополам и выполняется тот же алгоритм, пока мы не найдем наш элемент*/
package CollectionsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchLearn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            list.add(Math.toIntExact(Math.round(Math.random() * 100)));
        }

        findInt(list, 12);

        Collections.sort(list);
        //findInt(list, 12);

        Employee employee1 = new Employee("Bob", 20000);
        Employee employee2 = new Employee("John", 40000);
        Employee employee3 = new Employee("Garry", 15030);
        Employee employee4 = new Employee("Rob", 70000);
        Employee employee5 = new Employee("Josh", 20001);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        ArrayList<Employee> employeesList = new ArrayList<>(Arrays.stream(employees).toList());
        Collections.sort(employeesList);

        int index = findObject(employeesList, employee2);
        if (index >= 0) {
            System.out.printf("Работник[%s], имеющий ID = %d, находится под индексом %d\n", employee2.getName(),
                    employee2.getID(), index);
        } else {
            System.out.println("Работник не найден");
        }

        int[] array = {-3, 10, 40, 22, 15, -102, 150, 19};
        System.out.printf("Массив до: %s\n", Arrays.toString(array));
        Arrays.sort(array);
        System.out.printf("Массив после: %s\n", Arrays.toString(array));

        int index1 = Arrays.binarySearch(array, 22);
        System.out.printf("Индекс элемента \"%d\" = %d\n", 22, index1);

        focusWithList();
    }

    private static void findInt(ArrayList<Integer> list, int target) {
        int index = Collections.binarySearch(list, target);
        if (index >= 0) {
            System.out.printf("Индекс %d: %d", target, index);
        } else {
            System.out.println("Элемент не найден");  // Всегда будет этот вариант, пока лист не отсортирован
        }
    }

    private static int findObject(ArrayList<Employee> list, Employee employee) {
        return Collections.binarySearch(list, employee);
    }

    private static void focusWithList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(Math.toIntExact(Math.round(Math.random() * 100)));
        }
        System.out.printf("Лист до: %s\n", list);

        Collections.reverse(list);
        System.out.printf("Перевернутый лист: %s\n", list);

        Collections.shuffle(list);
        System.out.printf("Перемешанный лист: %s\n", list);
    }
}

class Employee implements Comparable<Employee> {
    private final int id;
    private final int salary;
    private final String name;
    private final int countEmployee;
    private static int count;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        id = Math.toIntExact(Math.round(Math.random() * 1000000));
        countEmployee = count++;
    }

    public String getName() { return name; }
    public int getID() { return id; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("Employee №%d = [name: %s, ID: %d, salary: %d]", countEmployee, name, id, salary);
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id - anotherEmployee.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}