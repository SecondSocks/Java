package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public void sum(int a, int b) {
        System.out.printf("Summary of a and b: %d\n", a+b);
    }

    public void subtraction(int a, int b) {
        System.out.printf("Subtract of a and b: %d\n", a-b);
    }

    public void multiply(int a, int b) {
        System.out.printf("Multiply of a and b: %d\n", a*b);
    }

    public void division(int a, int b) {
        System.out.printf("Division of a and b: %d\n", a/b);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Reflection/test.txt"))) {
            String methodName = reader.readLine();
            String firstNumber = reader.readLine();
            String secondNumber = reader.readLine();

            Calculator calculator = new Calculator();
            Class calc = calculator.getClass();
            Method method = null;

            Method[] methods = calc.getDeclaredMethods();
            for (Method m : methods) {
                if (m.getName().equals(methodName)) {
                    method = m;
                    break;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstNumber),
                    Integer.parseInt(secondNumber));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}