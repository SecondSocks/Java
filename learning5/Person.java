package learning5;

import java.io.Serializable;

public class Person implements Serializable {  // Чтобы Java получил разрешение на сериализацию, нужно добавить интерфейс
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }
}
