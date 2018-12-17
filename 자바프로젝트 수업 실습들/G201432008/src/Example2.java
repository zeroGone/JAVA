import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example2 {

    static void add(List<Integer> list, int count) {
       // list ��Ͽ� 0���� count ���� ������ �߰��Ѵ�.
    	for(int i=0; i<count; i++) list.add(i);
    }

    static void removeEven(List<Integer> list) {
       // list ��Ͽ��� ¦���� ���� �����Ѵ�.
    	Iterator<Integer> itr = list.iterator();
    	while(itr.hasNext()) {
    		int value = itr.next();
    		if(value%2==0) itr.remove();
    	}
    }

    static void addEven(List<Integer> list) {
       // list ����� Ȧ�� ���� ���̿� ¦�� ���� �����Ѵ�.
    	ListIterator<Integer> itr = list.listIterator();
    	while(itr.hasNext()) {
    		int value = itr.next();
    		if(value%2==1) itr.add(value-1);
    	}
    	list.sort(null);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        add(list, 10);
        System.out.println(list.toString());

        removeEven(list);
        System.out.println(list.toString());

        addEven(list);
        System.out.println(list.toString());
    }
}
