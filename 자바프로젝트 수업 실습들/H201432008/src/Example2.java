import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Example2 {

    static void solution(List<Integer> a) {
        // 목록 a에서 2의 배수와 3의 배수를 모두 제거하라
    	ListIterator<Integer> list = a.listIterator();
    	while(list.hasNext()) {
    		int value = list.next();
    		if(value%2==0||value%3==0) list.remove();
    	}
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7}));
        System.out.println(a.toString());
        solution(a);
        System.out.println(a.toString());
    }
}
