// class rules{
//  static void add(){  //static method without create obj class name diye call 
//     int a=10;
//     int b=20;
//     int c=a+b;
//     System.out.println(c);

//  }

//     public static void main(String[] args) {
//         rules.add();

//     }

// }






// class rules{
//  void add ()
//  {                        //non-static method first create obj for class then obj ref diye call 
//     int a=10;
//     int b=20;
//     int c=a+b;
//     System.out.println(c);

//  }

//     public static void main(String[] args) {

//            rules ref=new rules ();   //obj creation for class 
      
//            ref.add();  

//     }

// }






// class rules{
//  void add ()
//  {                        //non-static method first create obj for class then obj ref diye call 
//     int a=10;
//     int b=20;
//     int c=a+b;
//     System.out.println("sum is "+c);

//  }

//  static void sub ()    // static method 
//  {  
//     int a=30;
//     int b=20;
//     int c=a-b;
//     System.out.println("sub is "+c);

//  }

                     
//     public static void main(String[] args) {

//            rules ref=new rules ();   //obj creation for class 
//             ref.add();  //obj ref diye call bcz non static 

//            rules.sub();   // static so only class name diye call
      
      
      
//     for (int i = 0; i <=5; i++) {     //multiple times print sub

//         rules.sub();    //method call 
          
//       }

//     }

// }







class rules{


   int a=10; //Instance variable 
   static int b=20;
 
 
   void add ()
 {                        //non-static method first create obj for class then obj ref diye call 
    int c=a+b;
    System.out.println("sum is "+c);

 }

 static void  Disp()    // static method 
 {  
    
    
    
    // System.out.println(a); 
    // non-static variable a cannot be referenced from a static context. 
    // amake a ke static korte hobe then ami static method r moddhe access korte pari .

        System.out.println(b); //b is static that why we can access it 

 }

                     
    public static void main(String[] args) {

           rules ref=new rules ();   //obj creation for class 
           ref.add();  //obj ref diye call bcz non static 

           rules.Disp();   // static so only class name diye call


    }
    
}