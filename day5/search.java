import java.util.*;
class search {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        int key=sa.nextInt();
        int arr[]=new int[10];
        boolean fount=false;

        for(int i=0;i<arr.length;i++){
            arr[i]=sa.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.println("index of: "+arr[i]);
            fount=true;
            break;
        }
    }if(!fount)
        System.out.println("not fount");
    }
}
