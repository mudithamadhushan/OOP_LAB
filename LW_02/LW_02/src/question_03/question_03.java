package question_03;
import java.util.Scanner;
public class question_03 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the temperature in  Celsius: ");

        double cel = input.nextDouble();
        double fah = (1.8 * cel) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f" ,fah );
    }
}
