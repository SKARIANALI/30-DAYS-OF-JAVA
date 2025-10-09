// import java.util.Scanner;
// class triarea {
    
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the base of the triangle: ");
//         double base = sc.nextDouble();

//         System.out.print("Enter the height of the triangle: ");
//         double height = sc.nextDouble();

//         double area = 0.5 * base * height;

//         System.out.println("The area of the triangle is: " + area);
//     }

    
// }



//Scalene triangle

import java.util.Scanner;
class triarea {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of the three sides of tri :");
        int a,b,c,sp;
        double area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sp=(a+b+c)/2;

        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));


        System.out.println("The area of the triangle is: " + area);
    }

    
}



