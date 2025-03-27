package question_05;
import java.util.Scanner;
public class question_05 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");

        double fah = input.nextDouble();
        double cel = (5.0 / 9.0) * ( fah - 32) ;

        System.out.printf("Temperature in Celsius: %.2f" ,cel );
    }
}

