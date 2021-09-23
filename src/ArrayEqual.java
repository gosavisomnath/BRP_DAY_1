import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args)
    {
        int a[] = { 75, -1, 80 };
        int b[] = { 75, -1, 80 };
        boolean result = Arrays.equals(a, b);
        if (result == true)
        {
            System.out.println("Two arrays are equal");
        }
        else
        {
            System.out.println("Two arrays are not equal");
        }
    }
}