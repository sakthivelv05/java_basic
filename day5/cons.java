import java.util.*;

class cons {
    public static void main(String[] args) {
        constructors s=new constructors("Sakthi");
        constructors s2=new constructors(s);
        System.out.println(s.name);
        System.out.println(s2.name);

    }
}
class constructors{
    String name;
    String name2;
    constructors(){
        System.out.println("hi");

    }
    constructors(String nm){
        name=nm;
    }
    constructors(constructors j){
        name2 = j.name;
    }
}
