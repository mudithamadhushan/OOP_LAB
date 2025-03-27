package question_07;
import java.util.Scanner;
public class question_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Height in Centimeters: ");
        int height = input.nextInt();

        System.out.print("Enter Your Weight in kilograms): ");
        int weight = input.nextInt();

        double BMI = weight / (Math.pow( (height / 100.0), 2));
        System.out.printf("Your BMI value is: %.3f%n" ,BMI);

        if (BMI >= 20 && BMI <= 25) {
            System.out.println("Your BMI value is normal");

        } else
            System.out.println("Your BMI value is not in the healthy range");

    }
}
