// //                                 // Static  Block //

// class A{
//     int a,b;
//     static int  c;


//     void show()
//     {
//         a=50;
//         b=60;
//         System.out.println(a + " " + b);
//     }

//     A(){
//         a=10;
//         b=20;
//         System.out.println(a + " " + b);
//     }
           
//     //        static
//     //     { 
//     //        Static Block
//     //     }


//     static 
//     {
//         c=100;
//         // int a=30;        
//         // int b=40;    
//         // System.out.println(a + " " + b);     // Static block code first execute before constructor also Instance block;
//          System.out.println(c);   
//     }

// }

// class stat
// {
//     public static void main(String[] args) {
//         A r = new A();
//         r.show();
//         // System.out.println(r.a + " " + r.b);
       
//     }

// }









// class stat{

//     int a,b;

//     public static void main(String[] args) {
        
//        stat.show();    // we can call first as well as last 
//        stat ref= new stat();
       
//     }

//      stat() 
//      {
         
//          a=10;
//          b=20;
//          System.out.println(a + " " + b);
//      }

    


//     static void show()
//     {
//         System.out.println("Hello World");
//     }

//     {
//         System.out.println("Myself is Arian");
//     }


//     static
    
//     {
//         System.out.println("b.tech in 3rd year"); // Always static block atfirst execute
//     }


// }







class stat{

    public static void main(String[] args) {

     }

     static
    {
        System.out.println("b.tech in 3rd year");
    }

}

