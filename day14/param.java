                                         // Parameterized Constructor //




// class A{

//     int x,y;

// A(int a , int b)    // Parameterized Constructor //

//     {
//          x=a;
//          y=b;  
        
//     }

//     void show (){
       
//          System.out.println(x+" "+y);
//     }
// }

// class param{
//     public static void main(String[] args) {
//         A ref=new A(100,200);
//         ref.show();
//     }
// }        








class A{

    int x,y;

A(int a , int b)    // Parameterized Constructor //

    {
         x=a;
         y=b;  
        
    }


    A(int a , String  b)    // Parameterized Constructor //

    {
          System.out.println(a+" "+b);
        
    }

    void show (){
       
         System.out.println(x+" "+y);
    }
}

class param{
    public static void main(String[] args) {
        A ref=new A(100,200);
        ref.show();
        A r=new A(10,"arian");
    }
}        