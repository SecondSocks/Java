package java1000;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Число абитуриентов
        int m = scanner.nextInt();  // Сдавшие математику
        int f = scanner.nextInt();  // Сдавшие физику
        int l = scanner.nextInt();  // Несдавшие

        int mf = 0;  // Сдавшие оба экзамена
        int onlyM = 0;  // Только математика
        int onlyF = 0;  // Только физика

        for (int i = 0; i <= n-l; i++) {
            if (m != 0 && f != 0) {
                mf++; m--; f--;
            } else {
                onlyM = m;
                onlyF = f;
                break;
            }
        }

        System.out.printf("Сдавшие оба экзамена: %d\nСдавшие только математику: %d\nСдавшие только физику: %d",
                                                                                                      mf, onlyM, onlyF);
    }
}
