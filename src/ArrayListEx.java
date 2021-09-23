import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);
        for(int marks:list)
        {
            System.out.println(marks);
        }
        System.out.println("After Sorting");
        Collections.sort(list);
        for(int marks:list)
        {
            System.out.println(marks);
        }

    }
}
