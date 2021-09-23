public interface demo {
    void add(int a,int b);
    void substract(int a,int b);
}
class Calc1 implements  demo{

    @Override
    public void add(int a,int b) {
        int c=a+b;
        System.out.println("Add:"+c);

    }

    @Override
    public void substract(int a,int b) {
        int c=a-b;
        System.out.println("Sub:"+c);

    }

    public static void main(String[] args) {
        Calc1 obj=new Calc1();
        obj.add(10,10);
        obj.substract(10,5);

    }
}
class Calc2 implements demo{

    @Override
    public void add(int a, int b) {
        int c=a+b;
        System.out.println("Add"+c);
    }

    @Override
    public void substract(int a, int b) {
        int c=a-b;
        System.out.println("Sub"+c);

    }

    public static void main(String[] args) {
        Calc2 obj=new Calc2();
        obj.add(50,50);
        obj.substract(40,20);
    }
}
