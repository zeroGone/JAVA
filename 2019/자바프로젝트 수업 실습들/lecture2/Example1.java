package lecture2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {

    static int solution(List<Integer> list) {
        // 목록 a에서 가장 여러 번 등장하는 정수 값을 리턴하라
    	Map<Integer, Integer> count = new HashMap<>();
    	for(int i:list) {
    		if(count.containsKey(i)) count.put(i, count.get(i)+1);
    		else count.put(i, 1);
    	}
    	int max = list.get(0);
    	for(int i:count.keySet()) if(count.get(i)>count.get(max)) max = i;
    	return max;
    }
	
	public static void main(String[] args) {
		List<Integer> a =
                Arrays.asList(new Integer[] {1, 7, 1, 8, 5, 2, 2, 3, 5, 3, 1, 3, 7});
        System.out.println(a.toString());
        int maxValue = solution(a);
        System.out.println(maxValue);
	}

}
