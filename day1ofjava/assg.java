public class assg {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b; // a = a + b = 10 + 20 = 30
        System.out.println("a after +=: " + a); // 30

        a -= b; // a = a - b = 30 - 20 = 10
        System.out.println("a after -=: " + a); // 10

        a *= b; // a = a * b = 10 * 20 = 200
        System.out.println("a after *=: " + a); // 200

        a /= b; // a = a / b = 200 / 20 = 10
        System.out.println("a after /=: " + a); // 10

        a %= b; // a = a % b = 10 % 20 = 10
        System.out.println("a after %=: " + a); // 10
    }

}
