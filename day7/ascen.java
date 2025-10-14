//  import java.util.Arrays;
//  class ascen {
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 9};
//         Arrays.sort(arr); // Sorts the array in ascending order
//         System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
//     }

    
// }


//  import java.util.Arrays;
//  import java.util.Scanner;
// class ascen{
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
             
//              Arrays.sort(a); // Sorts the array in ascending order
//              System.out.println("Sorted array in ascending order: " + Arrays.toString(a));   //Arrays.toString() is a method 
       
       
//     }
// }



//for logic building 

import java.util.Scanner;
class ascen{
    public static void main(String[] args) {
        int size,i ;
        System.out.println("enter size of elements :");
        Scanner ref=new Scanner(System.in);
        size=ref.nextInt();
        int a[]= new int[size];
        System.out.println("enter array elements :");

        for(i=0;i<size;i++)
        {
        a[i]=ref.nextInt(); //array input
        }
            for(i=0;i<size;i++)
        { 
            for(int j=i+1;j<size;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
         }

        System.out.println("Sorted array in ascending order: ");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+ " ");
        
        }

   }
}