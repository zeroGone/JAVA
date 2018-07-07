/* 백준 알고리즘 11718번
 * 입력 그대로 출력 하기
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		
		int num=0;
		while(num<100) {
			String next="";
			//hasNextLine으로 먼저 검사를 해야 아무것도 입력하지 않았을때 NoSuchElement 오류가 뜨지 않는다.
			if(input.hasNextLine())//입력한 줄이 있으면 
				next=input.nextLine();//초기화 시킨다음
			//조건검사:글자수 100개 이하, 공백으로 시작 X, 공백으로 종료 X, 아무것도 입력하지 않았을때
			if(next.length()>100||next.isEmpty()||next.startsWith(" ")||next.endsWith(" ")) break;
			str.add(next);
			num++;
		}
		
		for(int i=0; i<str.size(); i++) {
			System.out.print(str.get(i)+"\n");
		}
	}
}
