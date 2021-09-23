import java.util.Scanner;

public interface Calculator {
    public void add();
    public void sub();
    public void mul();
    public void div();
}
class main implements Calculator {

    Scanner s=new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter First and Second Number");
        int a=s.nextInt();
        int b=s.nextInt();
        int c = a + b;
        System.out.println("Sum is:" + c);
    }

    @Override
    public void sub() {
        System.out.println("Enter First and Second Number");
        int p=s.nextInt();
        int q=s.nextInt();
        int c = p - q;
        System.out.println("Sub is:" + c);

    }

    @Override
    public void mul() {
        System.out.println("Enter First and Second Number");
        int a=s.nextInt();
        int b=s.nextInt();
        int c = a * b;
        System.out.println("Mul is:" + c);

    }

    @Override
    public void div() {
        System.out.println("Enter First and Second Number");
        int a=s.nextInt();
        int b=s.nextInt();
        int c = a / b;
        System.out.println("div is:" + c);

    }

    public static void main(String[] args) {
        main obj=new main();
        Scanner s = new Scanner(System.in);
        boolean status = true;
        do {
            System.out.println("Choose Operation you want to do");
            System.out.println("1. Add \t2.Sub \t3.Mul \t4.Div \t5.Back");
            switch (s.nextInt()) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    obj.sub();
                    break;
                case 3:
                    obj.mul();
                    break;
                case 4:
                    obj.div();
                    break;
                case 5:
                    status = false;
                    break;
            }
        } while (status);
    }
}
