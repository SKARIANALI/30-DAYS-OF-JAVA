 import java.util.Scanner;
  
 class cirarea {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14; // final bcz 3.14 fixed 


        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }

    
}
