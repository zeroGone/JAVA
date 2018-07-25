/* 2920번 음계
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 
 * 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. 
 * c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 * 입력:
 * 첫째 줄에 8개 숫자가 주어진다. 
 * 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 * 출력:
 * 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[8];
		
		for(int i=0; i<numbers.length; i++) 
			numbers[i]=input.nextInt();
		
		int standard = numbers[0];
		String 음계 = "";
		if(standard==1) 음계="ascending";
		else if(standard==8) 음계="descending";
		
		System.out.println(검사(음계,standard,numbers,1));
	}
	
	private static String 검사(String 음계,int standard, int[] numbers,int index ) {
		if(index>=numbers.length) return 음계;
		
		if(음계.equals("ascending")) {
			if(numbers[index]==++standard) return 검사(음계,standard,numbers,++index);
		}else if(음계.equals("descending")) {
			if(numbers[index]==--standard) return 검사(음계,standard,numbers,++index);
		}
		return "mixed";
	}
}

