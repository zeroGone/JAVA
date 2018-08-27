/* 1475�� �� ��ȣ
 * �ټ��̴� �������� ������ ���� �̻�Դ�. 
 * �ټ��̴� �ڱ� �� ��ȣ�� ���� �ö�ƽ ���ڷ� ���� ���̷��� �Ѵ�.
 * �ټ����� ���������� �ö�ƽ ���ڸ� �� ��Ʈ�� �Ǵ�. 
 * �� ��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. 
 * �ټ����� �� ��ȣ�� �־����� ��, �ʿ��� ��Ʈ�� ������ �ּҰ��� ����Ͻÿ�. 
 * (6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.)
 * �Է�:
 * ù° �ٿ� �ټ����� �� ��ȣ N�� �־�����. 
 * N�� 1,000,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * ���:
 * ù° �ٿ� �ʿ��� ��Ʈ�� ������ ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Integer> nums;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		nums= new ArrayList<Integer>();
		
		String value = input.next();
		
		number(value);
		
		System.out.println(solution());
	}

	
	private static int solution() {
		Iterator<Integer> iterator = nums.iterator();
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		while(iterator.hasNext()) {
			int temp = iterator.next();
			if(temp==9) temp=6;
			
			if(map.containsKey(temp)) map.put(temp, map.get(temp)+1);
			else map.put(temp, 1);
		}
		
		if(map.containsKey(6)&&map.get(6)>=2) map.put(6, (map.get(6)+1)/2);
		
		iterator = map.values().iterator();
		int num = 0;
		while(iterator.hasNext()) {
			int temp = iterator.next();
			if(num<temp) num=temp;
		}
		
		return num;
	}
	
	//�� �ڸ����� ���ڵ��� �迭�� �����ϴ� �޼ҵ�
	private static void number(String value) {
		for(int i=0; i<value.length(); i++) {
			nums.add(value.charAt(i)-48);
		}
	}
}