import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {

    public static void main(String[] args) {
        String[] a1 = { "d", "a", "b", "a", "c", "a" };
        String[] a2 = { "b", "a", "f", "e", "b", "b" };
        // ±¸Çö
        List<String> list1 = new ArrayList<String>();
        List<String> list2 =new ArrayList<String>();

        for(String s:a1) if(!list1.contains(s)) list1.add(s);
        for(String s:a2) if(!list2.contains(s)) list2.add(s);

        list1.retainAll(list2);
        System.out.println(list1.toString());
    }
}
