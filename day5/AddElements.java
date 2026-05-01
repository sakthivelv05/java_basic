import java.util.*;
class AddElements{
    public static void main(String[] args){
        Scanner sa=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
        arr[i]=sa.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}