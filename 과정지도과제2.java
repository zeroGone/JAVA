import java.util.HashMap;

/*
 *�迭�� ��� �� ¦�� ���� ���� ã�� �� 
 *��� ��ҵ��� �����ư��鼭 ���´ٴ� ����
 *a^a=0
 *a^0=a �� exclusive or�� �̿��ؼ� Ǯ��
 *hashmap�� �̿��ؼ� Ǯ���*/

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
	
	//�ؽ� ���� �̿��Ͽ� Ǯ��
	public static int hashmap_solution(int[] a,int i) {
		//���� ���� �迭�� ũ�⸦ ��� ���
		if(i>=a.length) {
			return searchKey(map,false);
		}
		
		//�迭�� ���� �� i��° ��Ұ� check�� �� Ű�� �ִ��� Ȯ��
		if(map.containsKey(a[i])) {
			//���࿡ �� Ű�� value��  true��� false�� �ٲ��ְ� false�� true�� �ٲ��ش�
			if(map.get(a[i])) map.replace(a[i], false);
			else map.replace(a[i], true);
		}
		//���ٸ� a[i]�� ���� �ʿ� �߰��ϰ� value���� false�� �ʱ�ȭ���ش�
		else {
			map.put(a[i], false);
		}
		return hashmap_solution(a,++i);
	}
	
	private static int searchKey(HashMap<Integer, Boolean> map, boolean check) {//Ű�� ã�� value ��(check)�� �ִ��� Ȯ���ϴ� �޼ҵ�
		for(int i:map.keySet()) {//keySet �޼ҵ带 �̿��� map�� ����� ��� Ű���� Ȯ���Ѵ�
			if(map.get(i).equals(check)) return i;//i�� value���� ��� check�� �����ϴٸ� i ����
		}
		return -1;//������� -1
	}
}
