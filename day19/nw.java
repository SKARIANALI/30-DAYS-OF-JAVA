                                          // New keyword //

// Use to create obj 
// runtime dynamic memory allocation 


// class nw{

//     int a=10;  // instance var 
//     public static void main(String[] args) {
//         nw ref= new nw();
//         System.out.println(ref.a);
        
//     }
// }




// class nw{

//     int a=10;

    
//      nw() // constuctor 
//      {
//         System.out.println(a);
//      }

    
//     public static void main(String[] args) {
//         nw ref= new nw(); // obj creation 
        
//     }
// }

import java.util.Scanner;

class nw{
    public static void main(String[] args) {
       int size;
       Scanner r= new Scanner(System.in);
       System.out.println("Enter size : ");
       size=r.nextInt(); // size input run time 
       int a[]= new int[size];
       System.out.println("Enter array elements : ");
       for (int i=0;i<size;i++)
       {
        a[i]=r.nextInt(); // arr elements input 
       }
       System.out.println("print array elements : ");
       
    //    for (int i=0;i<size;i++)
       for (int m : a)  // by using for each loop 
       {
        //   System.out.println(a[i]);
          System.out.println(m+" ");

       }


    }
}
