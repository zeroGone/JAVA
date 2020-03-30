/* 1157번 단어공부
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 입력:
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
 * 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 출력:
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String value = input.next();
		HashMap<Character, Integer> list = new HashMap();//문자와 문자가 나온 개수를 저장할 해쉬맵 리스트
		
		value=value.toUpperCase();//출력을 위해 대문자로 다초기화
		for(int i=0;i<value.length();i++) {
			if(!list.containsKey(value.charAt(i))) list.put(value.charAt(i), 0);//리스트에 없으면 새로 넣고
			else list.put(value.charAt(i), 1+list.get(value.charAt(i)));//있을시에는 문자가 나온 개수를 하나 더해준다
		}
		
		Iterator itr = list.keySet().iterator();//리스트 검사를 위해 이터레이터로 변환
		
		char output = (char)itr.next();//출력을 위한 변수를 첫 문자로 초기화해준다
		int num=list.get(output);//첫 문자의 나온 개수로 초기화해주고
		while(itr.hasNext()) {//최대값 찾기 알고리즘
			char ch= (char)itr.next();
			if(num<list.get(ch)) {
				num=list.get(ch);
				output=ch;
			}
			else if(num==list.get(ch)) output='?';//나온 개수가 같으면 출력을 ?로 초기화
		}
		
		System.out.println(output);
	}

}