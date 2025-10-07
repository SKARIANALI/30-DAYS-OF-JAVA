// class charprint {
//     public static void main(String[] args) {
//         char ch;
//         for(ch = 'a'; ch <= 'z'; ch++) {
//             System.out.println(ch);
//         }
//     }

// }


import java.util.Scanner;
class charprint{
    public static void main(String[] args) {
        char ch;
        System.err.println("Enter a character:");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);  //char input method
        System.out.println(ch);
        
           
        }
    }


