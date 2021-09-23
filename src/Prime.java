import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int num2= sc.nextInt();
        for(int i = num1; i <= num2 ; i++)
        {
            int count = 0;
            for(int j = 1 ; j <= i; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.println(i);
        }

    }
}