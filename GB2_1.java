import java.math.MathContext;
import java.util.Scanner;

class Number
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(Math.pow(a, b));
        sc.close();
    }
}