import java.util.Scanner;

class ExpenseCalculator {

    // Method to calculate total
    public void calculateTotal() {
        Scanner sc = new Scanner(System.in);

        int expense;
        double rate, total = 0;

        do {
            System.out.print("Enter expense (0 to stop): ");
            expense = sc.nextInt();

            if (expense != 0) {
                System.out.print("Enter rate: ");
                rate = sc.nextDouble();

                total += expense * rate;
            }

        } while (expense != 0);

        System.out.println("Total price = " + total);
    }
}

class sadmple {
    public static void main(String[] args) {
        ExpenseCalculator obj = new ExpenseCalculator();
        obj.calculateTotal();   // calling method
    }
}