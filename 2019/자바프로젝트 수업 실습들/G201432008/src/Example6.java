import java.util.HashMap;
import java.util.Random;

public class Example6 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(5);
        HashMap map = new HashMap<Integer, Integer>();
        for(int i:a) {
        	if(map.containsKey(i)) {
        		int value = (int) map.get(i);
        		map.put(i, value+1);
        	}
        	else map.put(i, 1);
        }
        
        System.out.println(map.toString());
    }
}
