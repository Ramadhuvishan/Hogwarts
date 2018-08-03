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
            int cnt=0;
            while(N>0)
            {
                N = N/10;
                cnt++;
            }
            System.out.print(cnt);
        }
        catch (InputMismatchException e)
        {
            //TODO: handle exception
            System.out.print("Invalid");
        }
        sc.close();
    }
}