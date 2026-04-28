class day2 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("a+b "+ (a+b));
        System.out.println("a-b "+ (a-b));
        System.out.println("a*b "+ (a*b));       
        System.out.println("a/b "+ (a/b));
        System.out.println("a%b "+ (a%b));
        
        System.out.println("a++ "+ (a++));
        System.out.println("a-- "+ (a--));   
        System.out.println("b++ "+ (b++));
        System.out.println("b-- "+ (b--));

        System.out.println("a && b "+ (a & b));
        System.out.println("a || b "+ (a | b));
        System.out.println("a ^ b "+ (a ^ b));
        System.out.println("~a "+ (~a));
        System.out.println("~b "+ (~b));


        System.out.println("a > b "+ (a > b));
        System.out.println("a < b "+ (a < b));
        System.out.println("a == b "+ (a == b));
        System.out.println(a<<1);
        System.out.println(a>>1);
    

        int max=(a>b) ? a : b;
        System.out.println("max is "+ max);

        System.out.println((a>b) ? "a is greater" : "b is greater");

         
    
    }
}
