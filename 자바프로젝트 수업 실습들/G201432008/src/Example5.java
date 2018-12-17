import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example5 {

    public static void main(String[] args) {
        String[] a1 = { "d", "a", "b", "a", "c", "a" };
        String[] a2 = { "b", "a", "f", "e", "b", "b" };
        // ±¸Çö
        
        List<String> list1 = new ArrayList<String>();
        List<String> list2 =new ArrayList<String>();

        for(String s:a1) if(!list1.contains(s)) list1.add(s);
        for(String s:a2) if(!list2.contains(s)) list2.add(s);

        ListIterator<String> itr = list1.listIterator();
        while(itr.hasNext()) {
        	String value = itr.next();
        	if(list2.contains(value)) itr.remove();
        }
        
        System.out.println(list1.toString());
    }
}
