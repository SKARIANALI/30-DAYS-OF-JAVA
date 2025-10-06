public class bitwise {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        System.out.println("a & b: " + (a & b)); // 0001 = 1

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); // 0111 = 7

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b)); // 0110 = 6

        // Bitwise NOT (for a)
        System.out.println("~a: " + (~a)); // -(a+1) = -6

        // Left Shift
        System.out.println("a << 1: " + (a << 1)); // 01010 = 10 (a * 2^1)

        // Right Shift
        System.out.println("a >> 1: " + (a >> 1)); // 0010 = 2 (a / 2^1)

        
    }

}
