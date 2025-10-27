                                            // Interface variable //

// variable public + static + final

interface customerak
{
    int amt=5;  // public + static + final
    void purchase(); // public + static 
}

class akash implements customerak
{    
    @Override
    public void purchase()
    {   
        // amt =5 ; // 5 kg is final donot change 
        System.out.println("akash needs : "+amt +" kg rice");
    }
}


class intvar 
{
    public static void main(String[] args) {
        akash ref=new akash();
        ref.purchase();
        System.out.println(customerak.amt);  // static var class name diye call
    }

    
}
