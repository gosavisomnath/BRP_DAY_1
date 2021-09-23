import java.util.*;

public class ArrayListDuplicate {
    public static void main(String[] args) {
        ArrayList <String> l=new ArrayList<String>();
        l.add("mango");
        l.add("banana");
        l.add("apple");
        l.add("mango");
        l.toString();
        Set<String> s=new HashSet<String>(l);
        for(String fruits:s)
        {
            System.out.println(fruits);
        }
        //converting into Array
        String[] array=l.toArray(new String[l.size()]);
        for(String p: array)
        {
            System.out.println(p);
        }
        //converting into ArrayList
        List<String> l2=new ArrayList<String>();
        l2=Arrays.asList(array);
        System.out.println(l2);
    }
}
