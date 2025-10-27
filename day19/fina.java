                                       // Final keyword //

// class fina 
// {
//     public static void main(String[] args) {
//         final int A=20; // final variable 
//         System.out.println(A);

//         // A=30; // cannot perform re-assignment
//         // System.out.println(A);
//     }
// } 


// final method cannot be overriden to the extends classes 


// class A 
// {
//     final void add()
//     {
//           int a=10;
//           int b=20;
//           System.out.println("sum is :"+ (a+b));
//     }
// }

// class B extends A
// {
//    void sub()
//    {
//      int a=40;
//      int b=20;
//     System.out.println("sum is :"+ (a-b));
//    }

//     // @Override
//     // void add()   // cannot override this method bcz this method is final 
//     // {
//     //       int a=10;
//     //       int b=20;
//     //       System.out.println("sum is :"+ (a+b));
//     // }

// }

// class fina 
// {
//     public static void main(String[] args) {
//         B ref= new B();
//         ref.add();
//         ref.sub();
//     }
// }






// final class cannot be extended or inherited into sub classes //


final class A 
{
    final void add()
    {
          int a=10;
          int b=20;
          System.out.println("sum is :"+ (a+b));
    }
}

// class B extends A  // cannot extended or inherited 
// {
//    void sub()
//    {
//      int a=40;
//      int b=20;
//     System.out.println("sum is :"+ (a-b));
//    }

    // @Override
    // void add()   // cannot override this method bcz this method is final 
    // {
    //       int a=10;
    //       int b=20;
    //       System.out.println("sum is :"+ (a+b));
    // }

// }

class fina 
{
    public static void main(String[] args) {
        A ref=new A();  // obj creation for final class 
        ref.add();
    }
}
                                         

// final class fina 
// {
//     final void add()
//     {
//           int a=10;
//           int b=20;
//           System.out.println("sum is :"+ (a+b));
//     }
//     public static void main(String[] args) {
//         fina ref=new fina();
//         ref.add();
//     }
// }
