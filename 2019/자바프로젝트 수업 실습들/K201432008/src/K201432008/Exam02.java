package K201432008;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam02 {
	public static void solution(List<String> list) {
		// 구현하라.
		for(int i=0; i<list.size(); i++) 
			for(int j=i+1; j<list.size(); j++) 
				if(list.get(i).equals(list.get(j))) list.remove(j);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		solution(list);
		System.out.println(list);
	}
}
