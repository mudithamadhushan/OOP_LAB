package Q_04;

import java.text.SimpleDateFormat;

class DATE {
    public static void main(String[] args) {
        java.util.Date today = new java.util.Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(simpleDateFormat.format(today));
    }
}

