import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example1 {

    static int solution(List<Integer> list) {
        // 목록 a에서 가장 여러 번 등장하는 정수 값을 리턴하라
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0; i<list.size(); i++) {
    		int value = list.get(i);
    		if(map.containsKey(value)) map.put(value, map.get(value)+1);
    		else map.put(value, 1);
    	}
    	Iterator<Integer> itr = map.keySet().iterator();
    	int max = list.get(0);
    	while(itr.hasNext()) {
    		int value = itr.next();
    		if(map.get(max)<map.get(value)) max = value;
    	}
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
