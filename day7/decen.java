// import java.util.Scanner;
// class decen{
//     public static void main(String[] args) {
//         int size,i ;
//         System.out.println("enter size of elements :");
//         Scanner ref=new Scanner(System.in);
//         size=ref.nextInt();
//         int a[]= new int[size];
//         System.out.println("enter array elements :");

//         for(i=0;i<size;i++)
//         {
//         a[i]=ref.nextInt(); //array input
//         }
//             for(i=0;i<size;i++)
//         { 
//             for(int j=i+1;j<size;j++)
//             {
//                 if(a[i]<a[j])
//                 {
//                     int temp=a[i];
//                     a[i]=a[j];
//                     a[j]=temp;
//                 }

//             }
//          }

//          System.out.println("Sorted array in decending order: ");
//         for(i=0;i<size;i++)
//         {
//             System.out.println(a[i]+ " ");
        
//         }

//    }
// }



// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Scanner;

// class decen {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();
//         Integer a[] = new Integer[size]; // ✅ use Integer instead of int 
//         //Collections.reverseOrder() works only with objects, not primitive types.
//         //Your array a is of type int[], which is primitive.

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < size; i++) {
//             a[i] = sc.nextInt();
//         }

//         // Sorting in descending order
//         Arrays.sort(a, Collections.reverseOrder());

//         System.out.println("Array in descending order:");
//         for (int num : a) {
//             System.out.print(num + " ");
//         }
//     }
// }




import java.util.Arrays;
import java.util.Scanner;

class decen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(a);

        // Print in reverse order
        System.out.println("Array in descending order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

//Why size - 1?

// Because array indexes start from 0, not 1.
// So, the last element of the array is at position size - 1.

// For example:

// If size = 5

// Then last index = 5 - 1 = 4

// That means last element = a[4]