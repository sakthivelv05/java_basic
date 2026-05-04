import java.util.*;

class abs {
    public static void main(String[] args) {

        login a = new login();
        Scanner sa = new Scanner(System.in);

        System.out.println("Welcome to Sampath Home");

        System.out.print("Enter the user name: ");
        String b = sa.nextLine();

        System.out.print("Enter the password: ");
        int r = sa.nextInt();

        if (b.equals(a.check2()) && r == a.check()) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}

class login {

    private String username = "sakthi";
    private int password = 12345;

    int check() {
        return password;
    }

    String check2() {
        return username;
    }
}