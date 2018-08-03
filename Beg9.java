import java.util.Scanner;

class One
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int Arr[] = new int[N];
            int sum =0;
            for(int i=0;i<N;i++)
                Arr[i] = sc.nextInt();
            for(int i=0;i<K;i++)
                sum += Arr[i];
            System.out.print(sum);
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
            System.out.print("Invalid");
        }
        sc.close();
    }
}