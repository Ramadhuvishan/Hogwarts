import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Main
{
    public static void main(String args[])
    {
        int no = sc.nextInt();
        if(no>0)
            System.out.println("Positive");
        else if(no<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}