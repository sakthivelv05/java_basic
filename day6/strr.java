
class strr {
    public static void main(String[] args) {
        StringBuilder sa= new StringBuilder("");
        sa.append("sakthi");
        System.out.println(sa);
        sa.replace(0,2,"hi");
        System.out.println(sa);
        sa.reverse();
        System.out.println(sa);
        sa.charAt(3);
        System.out.println(sa);
        sa.delete(0,3);
        System.out.println(sa);
        sa.insert(2, "k");
        System.out.println(sa);
        System.out.println(sa.capacity());

        
    }
}
