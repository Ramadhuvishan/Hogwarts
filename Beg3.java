import java.util.InputMismatchException;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            char a = sc.next().charAt(0);
            if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid");
        }
        sc.close();
    }
}