enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Superclass
class Week {
    Day today;

    public void setDay(Day day) {
        this.today = day;
    }

    public void displayDay() {
        System.out.println("Today is: " + today);
    }
}

// Subclass
class SpecialWeek extends Week {
    public void isWeekend() {
        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SpecialWeek sw = new SpecialWeek();
        sw.setDay(Day.SATURDAY);
        sw.displayDay();
        sw.isWeekend();
    }
}

