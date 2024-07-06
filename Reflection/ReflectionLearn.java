package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionLearn {
    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("Reflection.Employee");
        Class employeeClass1 = Employee.class;
        Employee employee = new Employee();
        Class employeeClass2 = employee.getClass();

        Field classField = employeeClass.getField("id");
        System.out.printf("Type of id field: %s\n", classField.getType());

        System.out.println("-----------------------------------------------------------");

        Field[] classFields = employeeClass.getFields();
        for (Field field : classFields) {
            System.out.printf("Type of %s: %s\n", field.getName(), field.getType());
        }

        System.out.println("--------------------------------------------------------------------");

        Field[] allClassFields = employeeClass.getDeclaredFields();
        for (Field field : allClassFields) {
            System.out.printf("Type of %s: %s\n", field.getName(), field.getType());
        }

        System.out.println("-----------------------------------------------------------------------");

        Method classMethod = employeeClass.getMethod("increaseSalary");
        System.out.printf("Return type of method \"increaseMethod()\": %s\n", classMethod.getReturnType());
        System.out.printf("Parameters types: %s\n", Arrays.toString(classMethod.getParameterTypes()));

        System.out.println("---------------------------------------------------------------------------");

        Method classMethod1 = employeeClass.getMethod("setSalary", double.class);
        System.out.printf("Return type of method \"setSalary()\": %s\n", classMethod1.getReturnType());
        System.out.printf("Parameters types: %s\n", Arrays.toString(classMethod1.getParameterTypes()));

        System.out.println("---------------------------------------------------------------------------");

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.printf("Name of method: %s, ", method.getName());
            System.out.printf("return type: %s, ", method.getReturnType());
            System.out.printf("parameters types: %s\n", Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("--------------------------------------------------------------");

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.printf("Name of method: %s, ", method.getName());
            System.out.printf("return type: %s, ", method.getReturnType());
            System.out.printf("parameters types: %s\n", Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("--------------------------------------------------------------");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers()))
                System.out.printf("Name of method: %s, ", method.getName());
                System.out.printf("return type: %s, ", method.getReturnType());
                System.out.printf("parameters types: %s\n", Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("--------------------------------------------------------------");

        Constructor constructor =  employeeClass.getConstructor();
        System.out.printf("Constructor has %d parameters, ", constructor.getParameterCount());
        System.out.printf("their types are: %s\n", Arrays.toString(constructor.getParameterTypes()));

        Constructor constructor1 =  employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.printf("Constructor has %d parameters, ", constructor1.getParameterCount());
        System.out.printf("their types are: %s\n", Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("----------------------------------------------------------------------");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor construct : constructors) {
            System.out.printf("Name of constructor: %s, ", construct.getName());
            System.out.printf("it has %d parameters, ", construct.getParameterCount());
            System.out.printf("their types: %s\n", Arrays.toString(construct.getParameterTypes()));
        }
    }
}