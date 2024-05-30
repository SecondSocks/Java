package learning6;

public class Recursion {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
