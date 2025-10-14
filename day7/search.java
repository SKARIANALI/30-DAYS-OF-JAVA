// // class search {
// //     public static void main(String[] args) {
// //         int a[]= {10,20,30}; 

// //         System.out.println("first element of array elements is: " + a[0]);
// //         System.out.println("second elementof array elements is: " + a[1]);
        
        

// //     }

// // }


import java.util.Scanner;
class search{
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
        System.out.print("Enter the element to search: ");
        int search = ref.nextInt();
        for ( i = 0; i < size; i++) {
            if (a[i] == search) {
                System.out.println(search + " found at position " + (i));
                // // System.out.println(search + " found at position " + (i+1));  //find the array position
                return;
            }
           
        }  

       System.out.println(search + " not found");
    }
        
}
        
//using count variable int count=0;

        
// import java.util.Scanner;
// class search{
//     public static void main(String[] args) {
//         int size,i ;
//         int count=0;
//         System.out.println("enter size of elements :");
//         Scanner ref=new Scanner(System.in);
//         size=ref.nextInt();
//         int a[]= new int[size];
//         System.out.println("enter array elements :");

//         for(i=0;i<size;i++)
//         {
//         a[i]=ref.nextInt(); //array input
//         }
//         System.out.print("Enter the element to search: ");
//         int search = ref.nextInt();
//         for ( i = 0; i < size; i++) {
//             if (a[i] == search) {
//                 count++;
//             }
           
//         }  
//         if(count>0){
//             System.out.println(search + " found at position " + (i));
//         }
//         else{
//             System.out.println(search + " not found");
//         }
//     }

// }
