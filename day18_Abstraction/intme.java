                                            // interface methods //
interface  programming   // client requ noted 
{
     void developer();   
     void Rank(); 

}

abstract  class HTML implements  programming
{    
    @Override                 
    public void developer()
    {
        System.out.println("web developer 1");
    }

}

 class Java extends HTML  // extends bcz 50 % already done in HTML 
{    
    @Override
    public void Rank()
    {
        System.out.println("App developer 2");
    }
}

class intme
{
    public static void main ( String[] args)
    {    

        Java ref= new Java();
        ref.developer();
        ref.Rank();
    }

}

