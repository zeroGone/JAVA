package lecture1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
        String[] a2 = { "b", "a", "f", "e", "b", "b" };
        
        Set<String> list = new HashSet<String>();
        list.addAll(Arrays.asList(a1));
        list.removeAll(Arrays.asList(a2));
        
        System.out.println(list.toString());
	}

}
