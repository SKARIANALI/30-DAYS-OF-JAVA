

//Sum of N natural number using recursion



class itself{
    public static void main(String[] args){
       
        itself ref=new itself();
        int a=ref.sum(10);
        System.out.println("sum is : " +a);
    }

    int sum(int b)
    {
        if(b>0){

            return b+sum(b-1);
        }
        else{
            return 0;
        }
    }

}