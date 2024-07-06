package Reflection;

public class Employee1 {
    public  int id;
    public  String name;
    public  String department;
    private double salary = 1000;

    public Employee1 () {}

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.printf("New department is %s", department);
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
