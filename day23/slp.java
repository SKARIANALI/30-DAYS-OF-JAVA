class A extends Thread
{
    public void run()
    {   
        String name = Thread.currentThread().getName();
        try{
        for(int i=1; i<=3; i++)
        {
           System.out.println(name);
           Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
    }

}

class slp {
    public static void main(String[] args) throws InterruptedException
    {
        A obj1 = new A();   // t1
        A obj2 = new A();   // t2
        A obj3 = new A();   // t3

        obj1.setName("Thread 1");
        obj2.setName("Thread 2");
        obj3.setName("Thread 3");

        obj1.start();
        obj2.start();
        obj3.start();
    }

    
}
