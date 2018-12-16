package lecture1;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
        String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
        // ±¸Çö
        List<String> list = new ArrayList<String>();
        
        for(String value:a)
        	if(!list.contains(value)) list.add(value);
        
        System.out.println(list.toString());
	}
	
}
