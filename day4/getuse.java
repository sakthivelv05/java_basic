import java.util.*;
class getuse {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sa.nextLine();
        System.out.print("Enter age: ");
        byte age = sa.nextByte();
        System.out.print("Enter number: ");
        long num=sa.nextLong();
        System.out.print("Enter salary: ");
        double sal =sa.nextDouble();
        sa.nextLine();
        System.out.print("Enter address: ");
        String add = sa.nextLine();

        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("number: "+num);
        System.out.println("salary: "+sal);
        System.out.println("address: "+add);


    }
    
}
