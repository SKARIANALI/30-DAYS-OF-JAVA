//  class add {
//     public static void main(String[] args) {
//         int a[] = {10, 20, 30, 40, 50};
//         int sum = 0;

//         // for (int i = 0; i < a.length; i++) {
//         //     sum = sum + a[i];
//         // }

//         for(int b : a){
//             sum = sum + b;
//         }
//         System.out.println("Sum of array elements is: " + sum);
//     }

    
// }


import java.util.Scanner;
class add {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.println("enter size of  elements :");
        int size,sum=0 ;
        size=ref.nextInt(); 
        int a[]= new int[size]; //run time size 
        System.out.println("enter array elements :");

        for(int i=0;i<size;i++){
            a[i]=ref.nextInt(); //array input 
        }
        for(int b : a){
            sum = sum + b;
           
        }
        System.out.println("Sum of array elements is: " + sum);
        

    }
}


