package learning6;

public enum Season {
    SUMMER(24), WINTER(-15), SPRING(0), AUTUMN(5);  // Это объекты
    // Object -> Enum -> Season

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
