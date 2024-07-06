package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionLearn1 {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {
        Class employeeClass = Class.forName("Reflection.Employee");

        // < Java 11
        Employee obj = (Employee) employeeClass.newInstance();
        System.out.println(obj);

        // >= Java 11
        Constructor<Employee> constructor = employeeClass.getConstructor();
        Employee object = constructor.newInstance();

        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj1 = constructor1.newInstance(5, "Jack", "IT");
        System.out.println(obj1);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj1, 1200.59);
        System.out.println(obj1);
    }
}
