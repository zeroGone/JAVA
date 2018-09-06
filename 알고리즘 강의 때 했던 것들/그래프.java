import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static Map<Character, String> createGraph() {
        Map<Character,String> map = new HashMap<>();
        map.put('A', "BFH");  // A 정점에 인접한 정점 목록 등록
        map.put('B', "ACEF"); // B 정점에 인접한 정점 목록 등록
        map.put('C', "ABDE");
        map.put('D', "CE");
        map.put('E', "BCD");
        map.put('F', "ABHG");
        map.put('G', "FH");
        map.put('H', "AF");
        return map;
	}
	
	public static void DFS(Map 그래프, char 시작) {
		DFS(그래프, 시작, new HashSet<Character>());
	}
	
	public static void DFS(Map 그래프, char 시작, HashSet 방문) {
		방문.add(시작);
		System.out.print(시작+" ");
		String value =(String) 그래프.get(시작);
		for(int i=0; i<value.length(); i++) {
			if(!방문.contains(value.charAt(i))){
				DFS(그래프,value.charAt(i),방문);
			}
		}
	}
	
	public static void BFS(Map<Character,String> 그래프, char 시작) {
		Set<Character> 방문한정점 = new HashSet<>();
		Queue<Character> 방문할정점 = new LinkedList<Character>();
		
		방문한정점.add(시작);
		방문할정점.add(시작);
		while(!방문할정점.isEmpty()) {
			char print = 방문할정점.remove();
			System.out.print(print+" ");
			for(char temp : 그래프.get(print).toCharArray()) {
				if(!방문한정점.contains(temp)) {
					방문한정점.add(temp);
					방문할정점.add(temp);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DFS(createGraph(), 'A');
		System.out.println();
		BFS(createGraph(), 'A');
	}

}
