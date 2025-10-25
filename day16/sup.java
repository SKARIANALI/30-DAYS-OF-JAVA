                                        // Super Keyword //


// Same var

// class A{

//     int a =10;

// } 

// class B extends A{
//     int a=20;
//     void show()
//     {
//            System.out.println(a);
//            System.out.println(super.a);   // access super class var 

//     }
// }

// class sup extends A {

//     int a=30;
//     void disp()
//     {
//         System.out.println(a);
//         System.out.println(super.a);
//     }
//     public static void main(String[] args) {
//         B ref= new B();
//         sup r=new sup();
//         ref.show();
//         r.disp();

//     }

    
// }



// Same method 


// class A{

//    void show()
//    {
//     System.out.println("my self is arian ");
//    }

// } 

// class B extends A{
//     void show()
//     {

           
//            System.out.println("i am in 3rd year");
           
//     }
// }

// class sup extends A {

//     void show()
//     {    
//         super.show();                        // access super class method also class B
//         System.out.println("Fiem");
//     }
//     public static void main(String[] args) {
//         B ref= new B();
//         sup r=new sup();
//         r.show();
//         ref.show();

//     }

    
// }



// constuctor


// default cons super keyword not written bcz its already reserved 


// class A{

//    A()
//    {
//     System.out.println("my self is arian ");
//    }

// } 

// class B extends A{
//    B()
//     {

//            // super(); by default reserved 
//            System.out.println("i am in 3rd year");
           
//     }
// }

// class sup extends A {

//     sup()
//     {                   
//         System.out.println("Fiem");
//     }
//     public static void main(String[] args) {
//         B ref= new B();
//         sup r=new sup();

//     }

    
// }


// parameterized cons super keyword must be written




class A{

   A(int a)
   {
    System.out.println("my self is arian "+a);
   }

} 

class B extends A{
   B()
    {       

           super(100);                                   // written must for param cons
           System.out.println("i am in 3rd year");
           
    }
}

class sup  {
    public static void main(String[] args) {
        B ref= new B();
    }

    
}





