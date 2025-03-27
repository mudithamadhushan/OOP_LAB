package question_04;
import java.util.Scanner;
public class question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight of body: ");
        double bodyWeight = sc.nextDouble();
        double calories = bodyWeight * 19;
        System.out.println("You need approximately " + calories + " calories per day");
    }
}

