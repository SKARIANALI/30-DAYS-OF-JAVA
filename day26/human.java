class human
{  
    public static void main(String[] args) {
        men ref=new men("arian", 5.30);
        women ref1=new women("sathi", 7.40);
        ref.display();
        ref1.display();
    }
    String name;
    double height;

    void display()
    {
         System.out.println(name+" "+height);
    }
    human(String name,double height)
    {
        this.name=name;
        this.height=height;
    }

}

class men extends human
{
    @Override
    void display()
    {
        System.out.println(name+" "+height);
    }
    men(String name,double height)
    {
        super(name,height);
    }
}

class women extends human
{
    @Override
    void display()
    {
        System.out.println(name+" "+height);
    }
    women(String name,double height)
    {
        super(name,height);
    }
}
