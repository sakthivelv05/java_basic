import java.util.Scanner;

class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String num = sc.nextLine();
        todolist m = new todolist();
        m.todo(num);
    }
}
class todolist{
    void todo(String num){
        if(num.isEmpty()){
            System.out.println("No input provided.");
            return;
        }else{
            System.out.println("You entered: " + num);
        }
        
    }
}
