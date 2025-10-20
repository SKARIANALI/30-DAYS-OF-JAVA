class A{
    int a ; String name ;boolean c;

A()
    {

        a=10; name =null; c=true;
    }

    void show (){
        System.out.println(a+" " +name +" " +c);
    }
}

class dfcon{
    public static void main(String[] args) {
        A ref=new A();
        ref.show();
    }
}