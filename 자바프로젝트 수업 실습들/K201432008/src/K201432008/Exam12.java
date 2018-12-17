package K201432008;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam12 {
	public static String solution(List<String> list) {
		 Map<String, Integer> map = new HashMap<>();
		 for(String s:list) {
			 if(map.containsKey(s)) map.put(s, map.get(s)+1);
			 else map.put(s, 1);
		 }
		 String max = list.get(0);
		 for(String s:map.keySet()) if(map.get(s)>map.get(max)) max = s;
		 return max;
    }

    public static void main(String[] args) {
        List<String> a1 = Arrays.asList("a", "a", "b", "a", "c", "d", "e", "b", "e");
        List<String> a2 = Arrays.asList("b", "a", "d", "a", "a", "b", "i", "b", "b");
        System.out.println(solution(a1));
        System.out.println(solution(a2));
    }
}
