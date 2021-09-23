import java.util.HashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        int array[]={20,30,40,50,50,50,60,88,88,88};
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(!s.add(array[i]))
            {
                s.remove(array[i]);
            }
            else
            {
                s.add(array[i]);
            }
        }
        System.out.println(s);
    }
}
