import java.io.*;

class fileInfo {
    public static void main(String[] args) 
    {
         File f = new File("d:\\30daysjava\\day21\\createFile.txt");

         if(f.exists())
         {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
            // System.out.println("File removed successfully: " + f.delete()); // File removed 
         }
         else
         {
            System.out.println("File does not exist.");
         }
        
    }

    
}
