import java.util.InputMismatchException;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int N = sc.nextInt();
            for(int i = 0;i<N;i++)
                System.out.println("Hello");
        }
        catch (InputMismatchException e)
        {
            //TODO: handle exception
            System.out.print("Invalid");
        }
        sc.close();
    }
}