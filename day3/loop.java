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