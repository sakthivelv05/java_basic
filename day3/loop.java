import java.util.Scanner;

class loop {
    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);
        int num;

        System.out.println("Enter numbers: ");

        do {
            num = sa.nextInt();
            System.out.println("The number " + num);
        } while (num != 0);

        
    }
}

public class EvenBreak {
    public static void main(String[] args) {

        int i = 1;

        while(true) {

            if(i > 10) {
                break;   
            }

            if(i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}