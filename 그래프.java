import java.util.HashMap;
import java.util.HashSet;

public class Main {
	public static HashMap<Character, String> createGraph() {
        HashMap<Character, String> map = new HashMap<>();
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
	public static void DFS(HashMap 그래프, char 시작) {
		DFS(그래프, 시작, new HashSet<Character>());
	}
	
	public static void DFS(HashMap 그래프, char 시작, HashSet 방문) {
		방문.add(시작);
		System.out.print(시작+" ");
		String value =(String) 그래프.get(시작);
		for(int i=0; i<value.length(); i++) {
			if(!방문.contains(value.charAt(i))){
				DFS(그래프,value.charAt(i),방문);
			}
		}
		
	}
	
	public static void main(String[] args) {
		DFS(createGraph(), 'A');
	}

}
