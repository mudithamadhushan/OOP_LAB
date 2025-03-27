package Q_06;


import javax.swing.*;
import java.util.*;

class Framewindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w,h;
        String title;
        System.out.println("Enter the title of the window:");
        title = scanner.nextLine();
        System.out.println("Enter the width of the window:");
        w = scanner.nextInt();
        System.out.println("Enter the height of the window:");
        h = scanner.nextInt();


        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(w,h);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
