package lecture1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example4 {
	
    public static void main(String[] args) {
        String[] a1 = { "d", "a", "b", "a", "c", "a" };
        String[] a2 = { "b", "a", "f", "e", "b", "b" };
        // ±¸Çö
        Set<String> list1 = new HashSet<String>();
        list1.addAll(Arrays.asList(a1));
        list1.retainAll(Arrays.asList(a2));
        System.out.println(list1.toString());
    }
}
