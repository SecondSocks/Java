package learning;

public class Arrays {

    public static void main(String[] args) {

        System.out.println(); // sout -> Enter
        int number = 5; // Примитивный тип данных
        String s = "Привет"; // Ссылочный тип данных (Класс s = Объект)
        String s1 = new String("Привет"); // s/s1 - это ссылки на объект "Привет"
        // s == s1

        int[] arraysOfNumbers = new int[5]; // 5 - это размер массива  // Ссылочный тип данных
        // Без зпаолнения ячеек происходит автозаполнение каждой ячейки на 0
        arraysOfNumbers[0] = 12;  // Инициализация вручную

        for(int i = 0; i < arraysOfNumbers.length; i++) {
            if(i % 2 == 0) {
                arraysOfNumbers[i] = i * 10;
            } else {
                arraysOfNumbers[i] = i * 5 + 1;
            }
        }

        int j = 1;
        for(int elem : arraysOfNumbers) {
            System.out.printf("%s, %s", j, elem);
            j++;
        }

        int[] newArary = {1,2,3,4};
        for(int elem : newArary) {
            System.out.println(elem);
        }
    }
}
