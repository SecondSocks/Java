package learning6;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");  // ; - ставится, если после перечислений идет код
    // При создании конструктора, конструктор поумолчанию пропадает, поэтому Java не может автоматически создавать обэекты

    private final String translation;

    Animal(String translation) {  // Конструкторы всегда создаются приватными
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский: " + translation;
    }
}
