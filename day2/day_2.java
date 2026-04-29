class day_2 {
    String a;
    public static void main(String[] args){
        sak o=new sak();
        sak o2=new sak();
        o.a=50;
        System.out.println(o.a);
        System.out.println(o.b);
        o2.b=100;
        System.out.println(o2.a);
        System.out.println(o2.b);
        System.out.println(o2.c);
        o2.add();
       

    }

}

class sak{
    static final int c = 60;
    int a=20;
    static int b=30;
    void add(){
    final int s = 200;
    System.out.println(s);
    }
        
    }

