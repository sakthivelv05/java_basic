import java.util.Scanner;

class voteing {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sa.nextInt();

        if (age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("not Eligible");
        }
    }
}
