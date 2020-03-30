package e2018.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Exam08 {

	static Collection<String> intersection(Collection<String> c1, Collection<String> c2) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		Iterator<String> i = c1.iterator();
		while(i.hasNext()) list.add(i.next());
		i = c2.iterator();
		while(i.hasNext()) {
			String value = i.next();
			if(list.contains(value)) temp.add(value);
		}
		return temp;
    }

    public static void main(String[] args) {
        Collection<String> c1 = Arrays.asList("a", "b", "c", "d");
        Collection<String> c2 = Arrays.asList("b", "d", "e", "f");
        Collection<String> c3 = intersection(c1, c2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }

}
