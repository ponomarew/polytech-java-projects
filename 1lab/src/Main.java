import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if((j == i) || (j == n - (i + 1)))
                    System.out.print(n);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
