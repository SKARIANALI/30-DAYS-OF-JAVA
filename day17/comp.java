                                 // Compile time polymorphism //

                                 // Method overloading //
  
                    // class contain more than one method with same name but diff types of parameter //


// class A
// {
//    void add()
//    {
//     int a =10;
//     int b=20;
//     int c=a+b;
//     System.out.println(c);
//    }
//    void add(int x , int y)
//    {
    
//     int c=x+y;
//     System.out.println(c);
//    }
//    void add(int x , double y)
//    {
    
//     double c=x+y;
//     System.out.println(c);
//    }


// }         


// class comp{
//     public static void main(String[] args) {
//         A ref=new A();   // obj creation for class A
//         ref.add();
//         ref.add(30,40);
//         ref.add(60,20.30);
//     }
// }








class A
{
   int add()  // return type 
   {
    int a =10;
    int b=20;
    int c=a+b;
    return c;
   }
   void add(int x , int y)
   {
    
    int c=x+y;
    System.out.println(c);
   }
   void add(int x , double y)
   {
    
    double c=x+y;
    System.out.println(c);
   }


}         


class comp{
    public static void main(String[] args) {
        A ref=new A();   // obj creation for class A
        // ref.add();
        ref.add(30,40);
        ref.add(60,20.30);

        int add=ref.add();  // store in add var
        System.out.println(add);  // print add

    }
}
