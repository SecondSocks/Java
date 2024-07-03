package learning6;

public class EnumLearning1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
    }

}

enum WeekDays {
    MONDAY ("Very Bad"),
    TUESDAY ("Bad"),
    WEDNESDAY ("So-so"),
    THURSDAY ("Normal"),
    FRIDAY  ("Good"),
    SATURDAY ("Very Good"),
    SUNDAY ("Happy-Happy-Happy");

    private final String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() { return mood; }
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    public void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Let's go working");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Let's play PC and stay at home");
                break;
        }
        System.out.printf("My mood: %s", weekDay.getMood());
    }
}