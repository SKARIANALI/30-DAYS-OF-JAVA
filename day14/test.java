class demo {
    int a =10 ; String b="arian";

    void show ()
    {
        System.out.println(a+" "+b);
    }
}

class test
{   
    public static void main(String[] args) {

         demo ref=new demo();
         ref.show();
        
    }
}