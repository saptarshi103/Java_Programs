import java.util.Scanner;
import java.util.Calendar;
public class DayFinder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter date: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int x =sc.nextInt();
        int month =x -1;
        System.out.print("Enter year: ");
        int year =sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch(dayOfWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
