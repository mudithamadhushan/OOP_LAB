package Q_09;


import java.util.*;

class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text : ");
        String text = scanner.nextLine();
        int length = text.length();

        System.out.println(length);
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(length-1));

    }
}
