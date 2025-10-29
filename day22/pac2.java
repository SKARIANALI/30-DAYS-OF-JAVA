
package arian2;

class pacg{
     protected void show() // protected //
    {
        System.out.println("hello arian");
    }

}
class pac2 extends pacg
{
    public static void main(String[] args) {
        pac2 ref=new pac2();
        ref.show();
       
    }

    
}