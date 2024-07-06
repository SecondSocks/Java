package Reflection;

import java.lang.reflect.Field;

public class ReflectionLearn2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee1 employee = new Employee1(1010231, "Frank", "IT");
        Class employeeClass = Employee1.class;
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);  // Предоставляет доступ к private полям, методам

        double salaryValue = (Double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 2000.00);
        System.out.println(employee);
    }
}
/*Reflection обходит принципы инкапсуляции*/