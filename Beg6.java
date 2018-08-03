import java.util.InputMismatchException;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int year = sc.nextInt();
            if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))    
                System.out.print("yes");
            else
                System.out.print("no");
        }
        catch (InputMismatchException e)
        {
            //TODO: handle exception
            System.out.print("Invalid");
        }
        sc.close();
    }
}