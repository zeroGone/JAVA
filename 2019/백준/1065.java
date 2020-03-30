/* 1065번 한수
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 * 입력:
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 출력:
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println(한수(num,1,0));
	}
	
	private static int 한수(int value,int start,int num) {
		if(value<start) return num;
		int 백 = start/100%10;
		int 십 = start/10%10;
		int 일 = start%10;
		if(start==1000) return num;//입력이 1000까지 포함하기때문에 검사해봐야한다..
		else if(백==0) num++;
		else if(백-십==십-일) num++;
		return 한수(value,++start,num);
	}
}
