                                        // This keyword //


// class th{
//     void show()
//     {
//         System.out.println(this);   // here this is a keyword refers to a same current obj

//     }

//         public static void main(String[] args)
//         {
//             th ref=new th();
//             System.out.println(ref);
//             ref.show();
//         }
//     }





// class th{

//     int a ;  // Instance variable

//     th(int a )   // local variable
//     {
//         // a=a;   // confusion create and print default value of instance variable a=0;

//         this.a=a; 
//     }
//     void show()
//     {
//         System.out.println(a);   

//     }

//         public static void main(String[] args)
//         {
//             th ref=new th(100);
//             ref.show();
//         }
//     }




// class th{
//     th()
//     {
//         System.out.println("Myself is Arian");
//     }

    
//     th(int a )   
//     {
//         this();  // call default constuctor in same class
//         System.out.println(a);
        
//     }
//         public static void main(String[] args)
//         {
//             th ref=new th(100);
//         }
//     }




    class th{
    th()
    {   
        this(100);   // call parameterized constuctor 
    }

    
    th(int a )   
    {
        System.out.println(a);
        
    }
        public static void main(String[] args)
        {
            th ref=new th();
        }
    }

    


