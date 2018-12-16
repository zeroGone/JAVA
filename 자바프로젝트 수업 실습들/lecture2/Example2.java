package lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	static void solution(List<Integer> a) {
        // 목록 a에서 2의 배수와 3의 배수를 모두 제거하라
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()) {
			int value = itr.next();
			if(value%2==0||value%3==0) itr.remove();
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
