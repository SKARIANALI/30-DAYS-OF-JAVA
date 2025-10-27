//                                             //   Interface JDK 1.8 //

//  // add default method and static method inside the interface as well as implemented that //

// //  // if we put 2 methods inside the interface and we are implements only one then gives me a error must be override 
// //  this two methos //

//  // 1. deafult method //

// interface a
// {
//     void a1();
//     void a2();

//      default void a3()
//      {
//         System.out.println("a3 may or may not override into the implementing classes");
//      }
// } 

// class b implements a{
//     public void a1(){
//         System.out.println("class b a1");
//     }
//     public void a2(){
//         System.out.println("class b a2");
//     }

//     // public void a3()
//     //  {
//     //     System.out.println("a3 override into the implement class b");   // print this instead of default a3
//     //  }
// }

// class c implements a{
//     public void a1(){
//         System.out.println("class c a1");
//     }
//     public void a2(){
//         System.out.println("class c a2");
//     }
// }

// class intf8
// {
//     public static void main(String[] args) 
//     {
//         b ref=new b();
//         ref.a1();
//         ref.a2();
//         ref.a3();




//         c ref2=new c();
//         ref2.a1();
//         ref2.a2();
//         ref2.a3();
//     }
// }




// 2. static method //

// donot override //


// interface a
// {
//     void a1();
//     void a2();

//      public static void a3()
//      {
//         System.out.println("a3 cannot override into the implementing classes");
//      }
// } 

// class b implements a{

//     public void a1(){
//         System.out.println("class b a1");
//     }
//     public void a2(){
//         System.out.println("class b a2");
//     }
    
//     // @Override

//     // public static void a3()
//     //  {
//     //     System.out.println("errors");   // cannot override //
//     //  }
// }

// class c implements a{
//     public void a1(){
//         System.out.println("class c a1");
//     }
//     public void a2(){
//         System.out.println("class c a2");
//     }
// }

// class intf8
// {
//     public static void main(String[] args) 
//     {
//         b ref=new b();
//         ref.a1();
//         ref.a2();
//         a.a3();  // accessable  by interface name //




//         c ref2=new c();
//         ref2.a1();
//         ref2.a2();
//         a.a3();
//     }
// }


// we can also write main method inside the interface 


// interface intf8
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("rule 4");
//     }

// }












 
 

