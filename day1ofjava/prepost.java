public class prepost {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);   // 10
        System.out.println(++a); // 11 (a becomes 11)
        System.out.println(a);   // 11

        int b = 10;
        System.out.println(b);   // 10
        System.out.println(b++); // 10 (b becomes 11 after this line)
        System.out.println(b);   // 11

        int c = 10;
        System.out.println(c);   // 10
        System.out.println(--c); // 9 (c becomes 9)
        System.out.println(c);   // 9

        int d = 10;
        System.out.println(d);   // 10
        System.out.println(d--); // 10 (d becomes 9 after this line)
        System.out.println(d);   // 9
    }

}
