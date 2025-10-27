                                      // covariant return type //

class a {
    a show()
    {
        System.out.println("myself is arian ");

        return this ; // this is a keyword refers to a current obj // this ----> new a();
    }
}                                        

class b extends a
{     
    @Override
      b show() // we can change return type 
    {    
             super.show(); // super is a keyword to call super class method 
        System.out.println(" i am  pro player ");

        return this ; // this is a keyword refers to a current obj // this ----> new b();
    }
}

class crt{
    public static void main(String[] args) {
        b ref= new b();
        ref.show();
    }
}

