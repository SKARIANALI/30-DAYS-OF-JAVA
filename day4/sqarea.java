 
 import java.util.Scanner;
  
class sqarea {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = sc.nextDouble();

        double area = side * side;

        System.out.println("The area of the square is: " + area);
    }

    
}
