                                            // throws keyword //
                                        // By pass caller JVM //

// class thrs {
//     public static void main(String[] args) throws InterruptedException   // handle 
//     {
//        for (int i=1;i<=10;i++)
//        {
//         System.out.println(i);
//         Thread.sleep(1000); // checked exception 
//        }
//     }

// }


                                           // Best approach //


// class thrs {
//     public static void main(String[] args) 
//     {
//        for (int i=1;i<=10;i++)
//        { 
//         try 
//         {
//            System.out.println(i);
//            Thread.sleep(1000); // unchecked exception 
//         } 
//         catch (InterruptedException e) 
//         {
//             System.out.println("Thread interrupted: " + e);
//         }
//        }
//     }

// }




                                                 // JVM Approach //

// class thrs {

//     void divide(int a , int b) throws ArithmeticException
//     {
//         if (b==0)
//         {
//             throw new ArithmeticException(" \n Do not divide by zero");
//         }
//         else 
//         {
//             int c = a/b;
//             System.out.println(c);
//         }
//     }
//     public static void main(String[] args) throws ArithmeticException
//     {
//        thrs ref=new thrs();
//        ref.divide(10,0); 

//     }
// }



// class thrs 
// {
//     public static void hold() throws InterruptedException
//     {
//         for (int i=1;i<=10;i++)
//        {
//          System.out.println(i);
//          Thread.sleep(1000); 
//        }
//     }
//     public static void main(String[] args) throws InterruptedException
//     {
//        hold();
//     }

// }





// class thrs 
// {
//     public static void hold() throws InterruptedException
//     {
//         for (int i=1;i<=10;i++)
//        {
//          System.out.println(i);
//          Thread.sleep(1000); 
//        }
//     }
//     public static void main(String[] args) throws InterruptedException
//     // public static void main(String[] args) throws Exception // We call super class but its gives error not sure ended termination//
//     {
//        hold();
//        System.out.println(10/0);
//        System.out.println("Program ends");
    
//     }

// }


                                         // Best approach try-catch //



class thrs 
{
    public static void hold() throws InterruptedException
    {
        for (int i=1;i<=10;i++)
       {
         System.out.println(i);
         Thread.sleep(1000); 
       }
    }
    public static void main(String[] args) 
    {  
      try
      {
       hold();
       System.out.println(10/0);
      }
      catch(Exception e)
      {
             System.out.println("exception handled......");
      }
       System.out.println("Program ends");
    
    }

}