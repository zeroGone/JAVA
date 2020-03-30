import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Integer> map;

    public static void main(String[] args) throws IOException  {
        String filePath = "C:\\Program Files\\Java\\jdk1.8.0_181\\THIRDPARTYLICENSEREADME.txt";
        Scanner scanner = new Scanner(Paths.get(filePath));
        scanner.useDelimiter("[^a-zA-Z]+");
        
        map = new HashMap<String, Integer>();
        List<String> data = new ArrayList<String>();
        
        while (scanner.hasNext()) {
            String s = scanner.next();
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else {
            	map.put(s, 1);
            	data.add(s);
            }
        }
        
        scanner.close();

        //구현실습문제2
        //빈도수 내림차순으로 출력
        data.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -(map.get(o1)-map.get(o2));
			}
        });

        //구현실습문제1
        //각 단어의 빈도수 출력
        for(String value:data) System.out.println(String.format("%s:%d", value, map.get(value)));
    }	
}
