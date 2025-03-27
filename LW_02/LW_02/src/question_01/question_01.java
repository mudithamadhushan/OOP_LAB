package question_01;
public class question_01 {
    public static void main(String[] args) {

        // 1st part
        int A = 2;
        int B = 4;
        int C = 8;

        double answer_a = Math.sqrt( Math.pow(B,2) + (4 * A * C) );
        System.out.println(answer_a);

        // 2nd part
        int X =100;
        int Y =5;

        double answer_b = Math.sqrt( X+(4*(Math.pow(Y,3))));
        System.out.println(answer_b);

        // 3rd part
        double answer_c = Math.cbrt(X*Y);
        System.out.println(answer_c);

        // 4th part
        int Radius = 14;
        double answer_d = Math.PI*Math.pow(Radius, 2);
        System.out.println(answer_d);

    }
}
