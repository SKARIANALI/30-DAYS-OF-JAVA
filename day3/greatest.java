// //Greatest number between two Numbers

// import java.util.Scanner;

//  class greatest{
//      public static void main(String[] args) {

//         int a,b;
        
//         Scanner ref = new Scanner(System.in);

//         System.out.println("Enter the first number:");
//          a = ref.nextInt();

//         System.out.println("Enter the second number:");
//          b = ref.nextInt();

//         if (a>b) {
//             System.out.println(a + " is the greatest number.");
//         } else if (b>a) {
//             System.out.println(b + " is the greatest number.");
//         } else {
//             System.out.println("Both numbers are equal.");
//         }

//     }

//  }


//among three numbers



 import java.util.Scanner;

 class greatest{
     public static void main(String[] args) {

        int a,b,c;
        
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter the first number:");
         a = ref.nextInt();

        System.out.println("Enter the second number:");
         b = ref.nextInt();

        System.out.println("Enter the third number:");
         c= ref.nextInt();

        if (a>b && a>c) {
            System.out.println(a + " is the greatest number.");
        } else if (b>a && b>c) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println(c + " is the greatest number.");
        }

    }

 }