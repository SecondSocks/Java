package learning6;

public class RecordsLearning {
    public static void main(String[] args) {
        Coordinates coord = new Coordinates(100,20);
        Coordinates coord2 = new Coordinates(150,20);

        // Record автоматически генерирует методы equals(), hashCode(), toString(), геттеры
        System.out.printf("%s\n", coord);
        System.out.print("Координаты №2: ");
        System.out.printf("x:%d; y:%d\n", coord2.x(), coord2.y());

        if (coord.equals(coord2)) {
            System.out.println("Координаты одинаковые");
        } else {
            System.out.println("Координаты разные");
        }

        System.out.printf("Hash Code №1: %d\nHash Code: №2: %d\n", coord.hashCode(), coord2.hashCode());

        System.out.printf("Вектор = %s\n", coord.vector(coord2));
    }
}

record Coordinates(int x, int y) {
    public String vector(Coordinates anotherCoord) {
        int[] coords = new int[2];
        coords[0] = anotherCoord.x - this.x;
        coords[1] = anotherCoord.y - this.y;

        return String.format("(%d,%d)", coords[0], coords[1]);
    }
}