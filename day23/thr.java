                                      // By extends Thread class //

// class A extends Thread // Thread is superclass 
// {   
//     @Override
//     public void run() // run is a predefined method 
//     {
//         for(int i=1; i<=5; i++)
//         {
//             System.out.println("Child Thread Arian");
//         }
//     }

// }  

// class thr{
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.start(); // start method calling run() // start is also a predefined method //

//         for(int i=1; i<=5; i++)
//         {
//             System.out.println("Main Thread Ankush");
//         }
//     }

// }






// class A extends Thread // Thread is superclass 
// {   
//     @Override
//     public void run() // run is a predefined method 
//     {   
//         try{
//         for(int i=1; i<=5; i++)
//         {
//             System.out.println("Child Thread Arian");
//             Thread.sleep(1000);
//         }
//     }
//     catch(InterruptedException e)
//     {
//         System.out.println(e);
//     }
//     }

// }  

// class thr{
//     public static void main(String[] args) throws InterruptedException
//     {
//         A obj = new A();
//         obj.start(); // start method calling run() // start is also a predefined method //

//         for(int i=1; i<=5; i++)
//         {
//             System.out.println("Main Thread Ankush");
//             Thread.sleep(1000);
//         }
//     }

// }


// output not guarantee that in same sequence for run() // total time ---> 5 sec //


                                    // Single Threading for userdefined method //

class A extends Thread // Thread is superclass 
{   
    public void fun() // userdefined method 
    {   
        try{
        for(int i=1; i<=5; i++)
        {
            System.out.println("Child Thread Arian");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
    }

}  

class thr{
    public static void main(String[] args) throws InterruptedException
    {
        A obj = new A();
        obj.fun(); // start method calling run() // start is also a predefined method //

        for(int i=1; i<=5; i++)
        {
            System.out.println("Main Thread Ankush");
            Thread.sleep(1000);
        }
    }

}


// total time ----> 10 sec //