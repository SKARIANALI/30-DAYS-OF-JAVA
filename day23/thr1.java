                            // Multithreading- by implementing Runnable interface in java //

class A implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("Child Thread Arian");
        }
    }
}

class thr1{
    public static void main(String[] args) {
        A obj = new A();
        Thread t = new Thread(obj);   // obj pass //
        t.start();
        for(int i=1; i<=5; i++)
        {
            System.out.println("Main Thread Ankush");
        }

    }

}









