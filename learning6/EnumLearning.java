package learning6;

public class EnumLearning {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's a unknown animal");
                break;
        }

        Season summer = Season.SUMMER;
        switch (summer) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
            case SPRING:
                System.out.println("It's slightly cool");
                break;
            case AUTUMN:
                System.out.println("It's fear outside");
                break;
            default:
                System.out.println("It's not season");
                break;
        }

        System.out.println(animal.getClass());
        System.out.println(summer.getClass());

        System.out.println(animal.getTranslation());

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());
        System.out.printf("\n%s\n", season.name());  // Получение имени перечисления
        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());
        System.out.printf("Индекс WINTER: %s", season.ordinal());
    }
}
