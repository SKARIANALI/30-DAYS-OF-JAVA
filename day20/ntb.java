                            // nested try block //
 
 
// class ntb {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//         //    int a = 10;
//         //    int b = 0;                         // donot write here bcz we are using nested try block 
//         //   int c = a / b;
//         //  System.out.println(c);

//          try 
//          {
//             int x[] = {1, 2, 3};
//             System.out.println(x[3]);
//          } 
//          catch (ArrayIndexOutOfBoundsException e) 
//          {
//             System.out.println("Array index out of bounds: " + e);
//          }

//          System.out.println(10/0); // here ....

//         } // outer block close 
//         catch (ArithmeticException e) // this catch is for outer block 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//           }

//     }
// }



// class ntb {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//            int a = 10;
//            int b = 2;
//            int c = a / b;
//          System.out.println(c);

//          try 
//          {
//             int x[] = {1, 2, 3};
//             System.out.println(x[3]);
//          } 
//          catch (ArrayIndexOutOfBoundsException e) 
//          {
//             System.out.println("Array index out of bounds: " + e);
//          }

//         } // outer block close 
//         catch (ArithmeticException e) // this catch is for outer block 
//         {
//             System.out.println("Cannot divide by zero: " + e);


//         }
//         System.out.println("Program ends");

//     }
// }







class ntb {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try 
        {

         try 
         {
            int x[] = {1, 2, 3};
            System.out.println(x[3]);
         } 
         catch (ArrayIndexOutOfBoundsException e) 
         {
            System.out.println("Array index out of bounds: " + e);
         }
           
         
           int a = 10;
           int b = 0;
           int c = a / b;
          System.out.println(c);

        } // outer block close  

        catch (ArithmeticException e) // this catch is for outer block 
        {
            
            System.out.println("Cannot divide by zero: " + e);


        }
        System.out.println("Program ends");

    }
}
