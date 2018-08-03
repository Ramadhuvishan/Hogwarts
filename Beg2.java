import java.util.InputMismatchException;
import java.util.Scanner;

class Test
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            if(n%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }    
        catch(InputMismatchException ME)
        {
            System.out.println("Invalid");
        }
        sc.close();
    }
}