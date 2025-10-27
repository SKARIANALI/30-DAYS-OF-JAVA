                               // Abstract Method //

// Incomplete information
                               
// Abs method must be overridden in sub classes otherwise it also became a abstract class 

// Action is same but implementation is diff then we should use abs method




//  abstract class programming   // we use abs method so abs class mandatory
// {
//     public abstract void developer();   // abs method 
//     public void study()
//     {
//         System.out.println("studying programming");
//     }
// }

// class HTML extends programming
// {    
//     @Override                  // must be override sub classes 
//     public void developer()
//     {
//         System.out.println("web developer");
//     }
// }

// class Java extends programming
// {    
//     @Override
//     public void developer()
//     {
//         System.out.println("App developer");
//     }
// }

// class absmt
// {
//     public static void main ( String[] args)
//     {    
//         programming ref3= new HTML();  // we create abs class ref but not to create object 
//         ref3.study();

//         HTML ref= new HTML();
//         ref.developer();
//         ref.study();

//         Java ref2= new Java();
//         ref2.developer();
//         ref2.study();
//     }

// }




//  if two abs method inside the asb class then we should be use override for sub classes these two methods ; must be  
//  two methods override  inside the sub classes otherwise it gives error ; if one method we use then we make these sub class
//  as a abstract class.



abstract class programming   // we use abs method so abs class mandatory
{
    public abstract void developer();   // abs method 1
    public abstract void Rank();   // abs method 2

}

class HTML extends programming
{    
    @Override                  // must be override sub classes 1
    public void developer()
    {
        System.out.println("web developer 1");
    }
     @Override                  // must be override sub classes 2
    public void Rank()
    {
        System.out.println("web developer 2");
    }
}

// class Java extends programming
 abstract class Java extends programming
{    
    @Override
    public void developer()
    {
        System.out.println("App developer 1");
    }
    // @Override
    // public void Rank()
    // {
    //     System.out.println("App developer 2");
    // }
}

class absmt
{
    public static void main ( String[] args)
    {    
        // programming ref3= new HTML();  // we create abs class ref but not to create object 
        // ref3.developer();
        // ref3.Rank();


        HTML ref= new HTML();
        ref.developer();
        ref.Rank();


        // Java ref2= new Java();
        // ref2.developer();
        // ref2.Rank();
    }

}









// abstract class programming   
// {
//     public abstract void developer();   
//     public abstract void Rank(); 

// }

// abstract class HTML extends programming
// {    
//     @Override                 
//     public void developer()
//     {
//         System.out.println("web developer 1");
//     }

// }

//  class Java extends HTML
// {    
//     @Override
//     public void Rank()
//     {
//         System.out.println("App developer 2");
//     }
// }

// class absmt
// {
//     public static void main ( String[] args)
//     {    

//         Java ref2= new Java();
//         ref2.developer();
//         ref2.Rank();
//     }

// }

