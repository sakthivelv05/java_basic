import java.util.Scanner;

public class day_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mark;

        System.out.print("Enter mark: ");
        mark = sc.nextInt();

        if (mark > 90) {
            System.out.println("A+");
        } else if (mark > 80) {
            System.out.println("B+");
        } else if (mark > 60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

       
    }
}