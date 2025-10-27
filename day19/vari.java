                                         // var arg method //
//  int [] a;
// using for each loop 


class vari 
{    

    void add(int ... a)  // var arg method 
    {   
        int sum=0;
        for ( int x : a)
        {
           sum+=x;
        }
        System.out.println("Sum is " + sum);
    }
    public static void main(String[] args) {
        vari ref= new vari();
        ref.add();
        ref.add(10);
        ref.add(10,20);
        ref.add(10,20,30);
        
    }
    
}
