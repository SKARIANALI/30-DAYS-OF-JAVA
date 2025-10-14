// class copy {
//     public static void main(String[] args) {
//         int a[] = {10, 20, 30, 40, 50};
//         int b[] = new int[a.length];  //size must same or greater ;

//         for (int i = 0; i < a.length; i++) {
//             b[i] = a[i];
//         }

//         System.out.println("Elements of original array (a):");
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//         System.out.println();

//         System.out.println("Elements of copied array (b):");
//         for (int i = 0; i < b.length; i++) {
//             System.out.print(b[i] + " ");
//         }
//         System.out.println();
//     }

    
// }



// import java.util.Scanner;
// class copy {
//     public static void main(String[] args) {
//         Scanner ref=new Scanner(System.in);
//         System.out.println("enter size of  elements :");
//         int size ;
//         size=ref.nextInt(); 
//         int a[]= new int[size]; //run time size 
//         int b[]=new int[a.length]; //b must be a.length 
//         System.out.println("enter array elements :");



       
//         for (int i = 0; i < a.length; i++) {
//             a[i]=ref.nextInt(); //array input
        
//         }

//         System.out.println("Elements of original array (a): ");
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < b.length; i++) {
//             b[i] = a[i]; // Copy elements from a to b
//         }
//         System.out.println("Elements of copied array (b): ");  
//         for (int i = 0; i < b.length; i++) {
//             System.out.print(b[i] + " ");
//         }
//     }

    
// }


//using copyof(a,size); method


import java.util.Arrays;
import java.util.Scanner;
class copy {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.println("enter size of  elements :");
        int size ;
        size=ref.nextInt(); 
        int a[]= new int[size]; //run time size 
        System.out.println("enter array elements :");



       
        for (int i = 0; i < a.length; i++) {
            a[i]=ref.nextInt(); //array input
        
        }

        System.out.println("Elements of original array (a): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int b[] = Arrays.copyOf(a, a.length);
        System.out.println();
        System.out.println("Elements of copied array (b): ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        

    }

    
}

