package HabrTasks;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] array = new int[99];
        for (int i = 2; i < 101; i++) {
            array[i-2] = i;
        }
        String primeNumbers = foundPrime(array);
        System.out.printf("Prime numbers in range 2 to 100: %s\n", primeNumbers);
    }

    private static String foundPrime(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 1; j < array[i]; j++) {
                if (j == 1 || j == array[i]) {
                    continue;
                } else {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                result = result + array[i] + ", ";
            }
        }
        return result;
    }
}
