package Lambda;

public class Student {
    private final String name;
    private final char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() { return name; }
    public char getSex() { return sex; }
    public int getAge() { return age; }
    public int getCourse() { return course; }
    public double getAvgGrade() { return avgGrade; }

    public void setAge(int age) { this.age = age; }
    public void setCourse(int course) { this.course = course; }
    public void setAvgGrade(double avgGrade) { this.avgGrade = avgGrade; }

    @Override
    public String toString() {
        return String.format("Student %s, Sex: %s, Years Old: %d, Course: %s, Avg.Grade: %f",
                name, sex, age, course, avgGrade);
    }
}
