
                                          // private constructor //

class pri {
    int a; int b;
     private pri()
     {
        a=10;
        b=20;
        System.out.println(a+" "+b);
     }

     public static void main(String[] args) {
             pri ref=new pri();
        
        }

}








// class pri {
//     int a; int b;
//      private pri()
//      {
//         a=10;
//         b=20;
//         System.out.println(a+" "+b);
//      }

// //      public static void main(String[] args) {
// //              pri ref=new pri();
        
// //         }

// }


// class A {
//         public static void main(String[] args) {

//              pri ref=new pri();   //pri() has private access in pri ref=new pri(); error
           
        
//         }
// }



// class pri {
//     int a; int b;
//      private pri()
//      {
//         a=10;
//         b=20;
//         System.out.println(a+" "+b);
//      }

//      static void show()  //must be static 
//      {
//           // ..............//
//      }

//      public static void main(String[] args) {
//              pri ref=new pri();
        
//         }

// }
