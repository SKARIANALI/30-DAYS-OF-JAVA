public class ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result;

        result = (a > b) ? a : b;
        System.out.println("The greater number is: " + result); // 20

        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("The largest number among num1, num2, num3 is: " + max); // 15
    }

}
