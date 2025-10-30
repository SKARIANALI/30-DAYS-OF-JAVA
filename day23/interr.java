                                // interrupt() method in java multithreading //

                                 
class A extends Thread
{
    public void run()
    {   
        String name = Thread.currentThread().getName();
        try{
        for(int i=1; i<=2; i++)
        {
           System.out.println(name);
           Thread.sleep(1000); // waiting //
        }
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
    }

}

class interr {
    public static void main(String[] args) {
        A obj1 = new A();   // t1
        A obj2 = new A();   // t2
        

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");
       
        obj1.start();
        obj2.start();

        obj1.interrupt(); // atfirst waiting state using sleep() then interrupt // 


    }

    
}







