package learning5;

import java.io.Serializable;

public class Person1 implements Serializable {  // Чтобы Java получил разрешение на сериализацию, нужно добавить интерфейс
    private static final long serialVersionUID = 1L;  // Означает версию класса. Если он меняется, то и поле нужно поменять
    // И это поле записывается вместе с файлами. Если оно поменяется, то старым объектам типа Person нельзя будет присвоить новый

    private String name;
    private transient int id;  // transient - означает, что это поле не будет сериализоваться

    public Person1(String name, int id) {
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
