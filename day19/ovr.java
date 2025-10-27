                                    // @override annotation //

class A 
{
    void show ()
    {
        System.out.println("super class ");
    }
}                                    

class B extends A 
{
    @Override
    void show ()  // override method 
    {
        System.out.println("sub  class ");
    }

    void disp()
    {
        System.out.println("sub 2 class ");

    }

}

class ovr{
    public static void main(String[] args) {
        B ref= new B();
        ref.show();
        ref.disp();
    }
}

