package question_06;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class question_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthyear = input.nextInt();

        GregorianCalendar cal = new GregorianCalendar();
        int current_year = cal.get(GregorianCalendar.YEAR);

        int age = current_year - birthyear;

        System.out.printf("You were born in %d and will be %d years old this year", birthyear, age);
    }
}
