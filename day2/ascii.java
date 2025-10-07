//  import java.util.Scanner;
//  class ascii {
//     public static void main(String[] args) {
//         char ch;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a character:");
//         ch = sc.next().charAt(0);  //char input method

//         int ascii = ch;  //implicit typecasting
//         System.out.println("The ASCII value of " + ch + " is: " + ascii);
        
//     }

// }






import java.util.Scanner;
 class ascii {
    public static void main(String[] args) {
        int ascii;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ascii value:");
        ascii = sc.nextInt(); 
        char ch = (char)ascii;  //explicit typecasting
        System.out.println("The character of " + ascii + " is: " + ch);


        
        
        
    }

}




