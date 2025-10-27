                                  // nested catch block //
 
class ncb {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try 
        {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception ref) 
            {   
                System.out.println("exception" +ref);
                try
                {
                    int x[] = {1, 2, 3};
                    System.out.println(x[3]);
                }
                catch (ArrayIndexOutOfBoundsException e) 
                {
                    System.out.println("Array index out of bounds: " + e);
                }
            }
        System.out.println("Program ends");
    }

    
}







// class ncb {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//             int a = 10;
//             int b = 5;
//             int c = a / b;
//             System.out.println(c);
//         }
//         catch (Exception ref) 
//             { 
//                 try
//                 {
//                     int x[] = {1, 2, 3};
//                     System.out.println(x[3]);
//                 }
//                 catch (ArrayIndexOutOfBoundsException e) 
//                 {
//                     System.out.println("Array index out of bounds: " + e);
//                 }
//             }
//         System.out.println("Program ends");
//     }

    
// }
