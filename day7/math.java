import java.util.*;
class math {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        int n=-50;
        int m=90;
        int v=30;
        double h=1.4;
        double s=30;


        System.out.println(Math.abs(n));
        System.out.println(Math.max(m, v));
        System.out.println(Math.max(m, v));
        System.out.println(Math.ceil(h));
        System.out.println(Math.floor(h));
        System.out.println(Math.round(h));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.sqrt(10));
        System.out.println(Math.cbrt(h));

        double radian=Math.toRadians(s);
        System.out.println(Math.sin(radian));
        System.out.println(Math.tan(radian));
        System.out.println(Math.cos(radian));

    }
}
