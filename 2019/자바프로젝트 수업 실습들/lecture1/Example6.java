package lecture1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Example6 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(5);
        // ±¸Çö
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:a) {
        	if(map.containsKey(i)) map.put(i, map.get(i)+1);
        	else map.put(i, 1);
        }
        
        for (int key : map.keySet())
            System.out.printf("%d=%d ", key, map.get(key));    
        
    }
}
