import java.util.Scanner;

class atm1{
    public static void main(String[] args) {

        int pin = 2005;
        Scanner sa = new Scanner(System.in);

        System.out.print("Enter the pin: ");
        int pi = sa.nextInt();

        if (pin == pi) {

            sample o = new sample();
            int choice;

            while (true) {

                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Exit");
                System.out.println("4.widhraw: ");
                
                System.out.print("Enter your choice: ");
                choice = sa.nextInt();

                if (choice == 1) {
                    System.out.println("Balance: " + o.getbalance());
                    break;
                } else if (choice == 2) {
                    System.out.print("Enter the amount: ");
                    int amt = sa.nextInt();
                    o.deposit(amt);
                    System.out.println("Amount deposited successfully.");

                } else if (choice == 3) {
                    System.out.println("You have exited.");
                    break; 

                }else if(choice==4){
                    System.out.print("Enter the amount: ");
                    int amtt=sa.nextInt();
                    System.out.print("Your amount has widraw");
                    break;

                }
                else {
                    System.out.println("Invalid choice. Try again.");
                }
            }

        } else {
            System.out.println("Incorrect PIN");
        }

        sa.close();
    }
}

class sample {
    private double balance = 3311;

    double getbalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
    }
}