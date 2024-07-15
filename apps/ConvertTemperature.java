package apps;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Из какой температуры нужны перевести: \n1-Цельсия, 2-Фаренгейт, 3-Кельвин:\n>>> ");
        int choice = scanner.nextInt();

        System.out.print("В какую температуру нужно перевести: \n1-Цельсия, 2-Фаренгейт, 3-Кельвин:\n>>>");
        int temp = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите температуру в Цельсии: ");
                double temp_c  = scanner.nextDouble();

                switch (temp)  {
                    case 1:
                        System.out.println("Температура в Цельсии: " + temp_c);
                        break;
                    case 2:
                        System.out.println("Температура в Фаренгейт: " + (temp_c * 1.8 + 32));
                        break;
                    case 3:
                        System.out.println("Температура в Кельвине: " + (temp_c + 273.15));
                        break;
                    default:
                        System.out.println("Вы ввели неверный вариант");
                        break;
                }
                break;
            case 2:
                System.out.print("Введите температуру в Фаренгейт:  ");
                double temp_f  = scanner.nextDouble();

                switch  (temp)   {
                    case 1:
                        System.out.println("Температура в Цельсии: " + ((temp_f - 32) / 1.8));
                        break;
                    case 2:
                        System.out.println("Температура в Фаренгейт: " + temp_f);
                        break;
                    case 3:
                        System.out.println("Температура в Кельвине: " + ((temp_f - 32) / 1.8 + 273.15));
                        break;
                    default:
                        System.out.println("Вы ввели неверный вариант");
                        break;
                }
            case 3:
                System.out.print("Введите температуру в Кельвине:  ");
                double temp_k   = scanner.nextDouble();

                switch   (temp)    {
                    case 1:
                        System.out.println("Температура в Цельсии: " + (temp_k - 273.15));
                        break;
                    case 2:
                        System.out.println("Температура в Фаренгейт: " + ((temp_k - 273.15) * 1.8 + 32));
                        break;
                    case 3:
                        System.out.println("Температура в Кельвине: " + temp_k);
                        break;
                    default:
                        System.out.println("Вы ввели неверный вариант");
                        break;
                }
                break;
            default:
                System.out.println("Вы ввели неверный вариант");
                break;
        }
    }
}
