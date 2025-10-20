                           // Constructor overloading //

//Means no. of (constructor>1) and parameter diff in each constructor // 


class A{

    int a ; double b; String c;
   
    A()
    {
            a=10;b=10.20;c="arian";
            // System.out.println(a+" "+b+" "+c);

    }

    A(int x)
    {
        a=x;
        // System.out.println(a);
    }

    A(int x , double y)
    {    
        a=x;
        b=y;
        // System.out.println(a+" "+b);

        
    }
}

class conover {
    public static void main(String[] args) {
        A ref = new A();
        A ref2 = new A(100);
        A ref3 = new A(100, 20.22);
         System.out.println(ref.a+" "+ref.b+" "+ref.c);
         System.out.println(ref2.a);
         System.out.println(ref3.a+" "+ref3.b);




    }

    
}



                //  rules : we cannot access default and private Constructor in the same class //


                //Also file name must be saved on the private cons name //


                // main method must be under the same class where we written the private cons //



// class Ab{  //file name must be changed before running //

//     int a ; double b; String c;
   
//     // A()
//     // {
//     //         a=10;b=10.20;c="arian";
//     //         // System.out.println(a+" "+b+" "+c);

//     // }

//     private Ab()
//     {
//             a=10;b=10.20;c="arian";
//             // System.out.println(a+" "+b+" "+c);

//     }

//     Ab(int x)
//     {
//         a=x;
//         // System.out.println(a);
//     }

//     Ab(int x , double y)
//     {    
//         a=x;
//         b=y;
//         // System.out.println(a+" "+b);

        
//     }

//      public static void main(String[] args) {
//         Ab ref = new Ab();
//         Ab ref2 = new Ab(100);
//         Ab ref3 = new Ab(100, 20.22);
//          System.out.println(ref.a+" "+ref.b+" "+ref.c);
//          System.out.println(ref2.a);
//          System.out.println(ref3.a+" "+ref3.b);




//     }

// }

// // class conover {
// //     public static void main(String[] args) {
// //         A ref = new A();
// //         A ref2 = new A(100);
// //         A ref3 = new A(100, 20.22);
// //          System.out.println(ref.a+" "+ref.b+" "+ref.c);
// //          System.out.println(ref2.a);
// //          System.out.println(ref3.a+" "+ref3.b);




// //     }

    
// // }
