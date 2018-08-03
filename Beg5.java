import java.util.InputMismatchException;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && a>c)
                System.out.print(a);
            else if(b>a && b>c)
                System.out.print(b);
            else
                System.out.print(c);
        }
        catch(InputMismatchException ex)
        {
            System.out.print("Invalid");
        }
        sc.close();
    }
}