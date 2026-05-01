import java.util.*;
class Modify {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("Enter the arr: ");
        int arr[]=new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sa.nextInt();
        }
        arr[3]=200;
        for(int i=0;i<arr.length;i++){
            System.out.println("Array element: "+arr[i]);
        }
    }
    
}
