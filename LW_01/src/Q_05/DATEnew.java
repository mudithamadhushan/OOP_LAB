package Q_05;


import java.text.SimpleDateFormat;
import java.util.Date;

class DATEnew {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");

        System.out.println(simpleDateFormat.format(today));
    }
}
