package lecture3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Example8 {
	static int solution(List<Integer> a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i:a) {
			if(map.containsKey(i)) map.put(i, map.get(i)+1);
			else map.put(i, 1);
		}
		int max = a.get(0);
		for(int i:map.keySet()) if(map.get(i)>map.get(max)) max = i;
		return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; ++i)
            a.add(random.nextInt(10) + 1);
        System.out.println(a.toString());
        int maxValue = solution(a);
        System.out.println(maxValue);
    }
}
