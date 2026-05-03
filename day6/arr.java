import java.util.ArrayList;
import java.util.Collections;

class arr {
    public static void main(String[] args) {
        ArrayList <Integer> arr =new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(77);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.contains(88));
         arr.set(2, 7);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
    }
}
