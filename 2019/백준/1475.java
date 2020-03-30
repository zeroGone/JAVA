/* 1475번 방 번호
 * 다솜이는 은진이의 옆집에 새로 이사왔다. 
 * 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
 * 다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 
 * 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
 * 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최소값을 출력하시오. 
 * (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
 * 입력:
 * 첫째 줄에 다솜이의 방 번호 N이 주어진다. 
 * N은 1,000,000보다 작거나 같은 자연수 또는 0이다.
 * 출력:
 * 첫째 줄에 필요한 세트의 개수를 출력한다.
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
	
	//각 자리수의 숫자들을 배열에 저장하는 메소드
	private static void number(String value) {
		for(int i=0; i<value.length(); i++) {
			nums.add(value.charAt(i)-48);
		}
	}
}