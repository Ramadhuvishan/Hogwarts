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
            int Sum=0;
            for(int i = 0;i<=N;i++)
                Sum += i;
            System.out.print(Sum);
        }
        catch (InputMismatchException e)
        {
            //TODO: handle exception
            System.out.print("Invalid");
        }
        sc.close();
    }
}