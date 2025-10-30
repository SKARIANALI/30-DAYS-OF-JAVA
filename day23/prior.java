                                // setPriority() and getPriority() method in java multithreading //             

                                // by default getPriority() is 5 //

                                // setPriority() ----> 1-10 //
                             
class A extends Thread
{
    public void run()
    {   
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
       

    }

}

class prior {
    public static void main(String[] args) {
        A obj1 = new A();   // t1
        A obj2 = new A();   // t2
        A obj3 = new A();   // t3

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");
        obj3.setName("Thread 3");

        obj1.setPriority(2);
        obj2.setPriority(6);
        obj3.setPriority(7);

        obj1.start();
        obj2.start();
        obj3.start();





       
    }

    
}

