import java.io.*;
class copyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("d:\\30daysjava\\day21\\createFile.txt");
        FileOutputStream w = new FileOutputStream("d:\\30daysjava\\day21\\copyFile.txt"); // file create + write //

        int i;
        while ((i = r.read()) != -1) {
            w.write((char) i);
        }
        System.out.println("File copied successfully.");
        r.close();
        w.close();
    }

    
}
