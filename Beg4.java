import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if((a>=65 && a<=90) || (a>=97 && a<=122))
            System.out.println("Alphabet");
        else
            System.out.println("No");
        sc.close();
    }
}