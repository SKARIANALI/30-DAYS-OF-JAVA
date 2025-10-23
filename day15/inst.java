                                //Instance Block //

// Instance Block deals with obj ; without obj creation instance block donot execute 

// class A{
//     int a,b;

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

//     //    { 
//     //        Instance Block
//     //    }

//     {

//         a=30;        
//         b=40;    
//         System.out.println(a + " " + b);     // Instance block code first execute before constructor 

//     }

// }

// class inst{
//     public static void main(String[] args) {
//         A r = new A();
//         r.show();
//         // System.out.println(r.a + " " + r.b);
       
//     }

// }












class A{
    int a,b;

   static void show()    //without obj creation call by using class_name . method_name();
    {
        
        System.out.println("Hello World");
    }

    A()
    {
        a=10;
        b=20;
        System.out.println(a + " " + b);
    }

    //    { 
    //        Instance Block
    //    }

    {

        a=30;        
        b=40;    
        System.out.println(a + " " + b);    

    }

}

class inst{
    public static void main(String[] args) {
        
        // A.show();              // we can call first as well as last 
        A r = new A();
        A.show();      
       
       
    }

}
