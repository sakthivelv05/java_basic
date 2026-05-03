
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class ran {
    public static void main(String[] args) {
        Random sa=new Random();
        int n=sa.nextInt(6);
        System.out.println(n);
        boolean b=sa.nextBoolean();
        System.out.println(b);
        double g=sa.nextGaussian();
        System.out.println(g);
        byte arr[]=new byte[5];
        sa.nextBytes(arr);
        System.out.println(Arrays.toString(arr));
        

    }
    
}
