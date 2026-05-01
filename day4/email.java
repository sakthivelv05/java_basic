import java.util.*;
class email {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("Enter the email: ");
        String email=sa.next();
        sa.nextLine();
        System.out.println("Enter name: ");
        String name =sa.nextLine();

        System.out.println("email "+email);
        System.out.println("name "+name);

    }
}
