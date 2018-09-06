import java.util.HashMap;

/*
 *배열의 요소 중 짝이 없는 값을 찾는 것 
 *대신 요소들이 번갈아가면서 나온다는 가정
 *a^a=0
 *a^0=a 를 exclusive or를 이용해서 풀기
 *hashmap을 이용해서 풀어보기*/

public class Solution {
	private static HashMap<Integer, Boolean> map;
	
	public static void main(String[] args) {
		map=new HashMap<Integer, Boolean>();
		int[] a = { 1, 32, 535, 6875, 71234, 1, 32, 6875, 71234, 535, 71234 };
	
		System.out.println(exclusiveOr_solution(a));
		System.out.println(hashmap_solution(a,0));
	}
	
	public static int exclusiveOr_solution(int[] A) {
		int r = 0; 
		for (int i : A) 
			r ^= i; 
		return r;
	}
	
	//해쉬 맵을 이용하여 풀기
	public static int hashmap_solution(int[] a,int i) {
		//종료 조건 배열의 크기를 벗어날 경우
		if(i>=a.length) {
			return searchKey(map,false);
		}
		
		//배열의 원소 중 i번째 요소가 check맵 중 키에 있는지 확인
		if(map.containsKey(a[i])) {
			//만약에 그 키의 value가  true라면 false로 바꿔주고 false면 true라 바꿔준다
			if(map.get(a[i])) map.replace(a[i], false);
			else map.replace(a[i], true);
		}
		//없다면 a[i]의 값을 맵에 추가하고 value값을 false로 초기화해준다
		else {
			map.put(a[i], false);
		}
		return hashmap_solution(a,++i);
	}
	
	private static int searchKey(HashMap<Integer, Boolean> map, boolean check) {//키에 찾는 value 값(check)가 있는지 확인하는 메소드
		for(int i:map.keySet()) {//keySet 메소드를 이용해 map에 저장된 모든 키들을 확인한다
			if(map.get(i).equals(check)) return i;//i에 value값을 얻어 check와 동일하다면 i 리턴
		}
		return -1;//없을경우 -1
	}
}
