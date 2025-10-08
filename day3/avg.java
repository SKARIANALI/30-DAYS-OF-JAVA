import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        int a,b,c,d,e;
        double avg;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects:");
        a = ref.nextInt();
        b = ref.nextInt();
        c = ref.nextInt();
        d = ref.nextInt();
        e = ref.nextInt();
        avg = (a+b+c+d+e)/5;

        System.out.println(avg);
        
    }
}
