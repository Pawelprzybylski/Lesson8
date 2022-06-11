import java.util.SortedMap;

public class Day {
    private static Days_Of_Week daysOfWeek;

    public static void printDayOfWeek() {
        switch (daysOfWeek) {
            case Monday:
                System.out.println("Poniedziałek");
                break;
            case Tuesday:
                System.out.println("Wtorek");
                break;
            case Wednesday:
                System.out.println("środa");
                break;
            case Thursday:
                System.out.println("Czwartek");
                break;
            case Friday:
                System.out.println("Piątek");
                break;
            case Saturday:
                System.out.println("Sobota");
                break;
            case Sunday:
                System.out.println("Niedziela");
                break;
        }

    }
}








