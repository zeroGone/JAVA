package K201432008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exam05 {

    public static List<String> union(String[] a1, String[] a2) {
    	Set<String> list = new HashSet<>();
    	list.addAll(Arrays.asList(a1));
    	list.addAll(Arrays.asList(a2));
    	return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        String[] a1 = { "a", "d", "a", "b", "b", "c" };
        String[] a2 = { "c", "a", "e", "f", "b", "g" };
        List<String> list = union(a1, a2);
        System.out.println(list.toString());
    }
}
