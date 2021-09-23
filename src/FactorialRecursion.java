import java.util.Scanner;

public class FactorialRecursion {
    static int factorial(int n){ //5  //4  //3 //2 //1 //0
        if (n == 0) // F //F //F //F //F //T
            return 1;
        else
            return(n * factorial(n-1));//5*factorial(5-1)->factorial(4)
                                          //4*factorial(4-1)->factorial(3)
                                          //3*factorial(3-1)->factorial(2)
                                          //2*factorial(2-1)->factorial(1)-
                                          //1*factorial(1-1)->factorial(0)-return 1

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number:");//5
        int number = sc.nextInt();//5
        int fact = factorial(number); //factorial(5)
        System.out.println("Factorial is: "+fact);
    }
}

