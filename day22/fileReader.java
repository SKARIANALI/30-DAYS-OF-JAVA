import java.io.*;
import java.util.Scanner;

class fileReader{
    public static void main(String[] args) 
    {
        File ref=new File("d:\\30daysjava\\day21\\createFile1.txt");
        try
        {
        Scanner sc= new Scanner(ref);

        while(sc.hasNextLine())
        {
            System.out.println(sc.hasNextLine());
            System.out.println(sc.nextLine());
            System.out.println(sc.hasNextLine());
        }
    }
    catch(IOException e)
    {
        System.out.println(e);
    }

    }
}