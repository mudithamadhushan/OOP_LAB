package question_02;
import java.util.Scanner;
public class question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Length in Centimeters: ");
        double cm = sc.nextDouble();


        int feet = (int) (cm / 30.48);
        double remainder = cm % 30.48;
        double inch = remainder / 2.54;


        System.out.printf("Your entered length in feet and inches: %d ft and %.2f inch%n", feet, inch);


    }
}
