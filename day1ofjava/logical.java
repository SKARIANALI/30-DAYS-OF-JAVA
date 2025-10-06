// public class logical {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int c = 30;

//         // Logical AND
//         System.out.println((a < b) && (b < c)); // true && true = true
//         System.out.println((a > b) && (b < c)); // false && true = false

//         // Logical OR
//         System.out.println((a < b) || (b > c)); // true || false = true
//         System.out.println((a > b) || (b > c)); // false || false = false

//         // Logical NOT
//         System.out.println(!(a < b)); // !(true) = false
//         System.out.println(!(a > b)); // !(false) = true
//     }

// }





import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();  //method declare 
        c = sc.nextInt();
        // Logical AND
        System.out.println((a < b) && (b < c)); // true && true = true
        System.out.println((a > b) && (b < c)); // false && true = false

        // Logical OR
        System.out.println((a < b) || (b > c)); // true || false = true
        System.out.println((a > b) || (b > c)); // false || false = false

        // Logical NOT
        System.out.println(!(a < b)); // !(true) = false
        System.out.println(!(a > b)); // !(false) = true
    }

}