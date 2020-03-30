/* Collection �����ڷ� �ǽ�
 * ����7�� �ڵ� ��
 * Collection interface�� addAll, retainAll, removeAll�� ������� �ʰ�
 * add, remove, contains �޼ҵ常 ����ϵ��� �����϶�
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    static void printCollection(String s, Collection<String> c) {
        String[] a = c.toArray(new String[0]);
        Arrays.sort(a);
        System.out.printf("%s: %s\n", s, Arrays.toString(a));
    }
    
    static void addAll(Collection<String> c1, Collection<String> c2) {
		Iterator<String> temp = c1.iterator();
		while(temp.hasNext()) c2.add(temp.next());
	}
    
    static void removeAll(Collection<String> c1, Collection<String> c2) {
    	Iterator<String> temp = c1.iterator();
		while(temp.hasNext()) c2.remove(temp.next());
    }
    
    static void retainAll(Collection<String> c1, Collection<String> c2) {
    	Object[] temp =  c2.toArray();
		for(int i=0; i<temp.length; i++) 
			if(!c1.contains(temp[i])) c2.remove(temp[i]);
    }
    
    public static void main(String[] args) {
        Collection<String> c1 = new Stack<String>();
        Collection<String> c2 = new LinkedList<String>();
        Collection<String> c3 = new ArrayList<String>();

        for (int i = 0; i < 20; i += 2) {
            String s = String.format("%02d", i);
            c1.add(s);
        }
        printCollection("c1 (2�� ���)", c1);
        
        for (int i = 0; i < 20; i += 3) {
            String s = String.format("%02d", i);
            c2.add(s);
        }
        printCollection("c2 (3�� ���)", c2);
        
        c3.clear();
        addAll(c1, c3);
        retainAll(c2,c3);
        printCollection("c1, c2 ������", c3);        

        c3.clear();
        addAll(c1, c3);
        removeAll(c2,c3);
        printCollection("c1, c2 ������", c3);

        c3.clear();
        addAll(c2, c3);
        removeAll(c1,c3);
        printCollection("c2, c1 ������", c3);

        c3.clear();
        addAll(c1, c3);
        removeAll(c2,c3);
        addAll(c2, c3);
        printCollection("c1, c2 ������", c3);
        
    }

}
