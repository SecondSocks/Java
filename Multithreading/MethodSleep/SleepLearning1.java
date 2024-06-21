package Multithreading.MethodSleep;

public class SleepLearning1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("GO!");
    }
}
