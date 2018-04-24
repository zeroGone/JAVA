import java.util.Scanner;

/*알고리즘 훈련
 *임의 숫자를 2진수로 바꾸고
 *바뀐 2진수의 0이 연속적으로 몇이나오는 지 출력하기
 *ex) 529=1000010001 출력:4,3
 *제약조건:Integer클래스의 2진수 변환 메소드 쓰지 않기
 * */

public class Main {
	public static int N;//사용자가 입력한 값을 이진수로 변환한 값

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("입력:");
		int num = input.nextInt();
		binary(num);
		System.out.println(N);

		String str=Integer.toString(N);
		gap(str,0,0);
	}
	
	public static void gap(String str,int i,int num) {
		if(i>=str.length()) return;
		if(str.charAt(i)=='0') {
			num++;
		}else {
			if(num>0) {
				System.out.print(num+" ");
				num=0;
			}
		}
		gap(str,++i,num);
	}

	public static void binary(int num) {
		if(num==0) return;//종료조건:num이 0일때
		int n=divisionNum(num);//num을 2로 몇번 나눌 수 있는지 세고
		int value=1<<n;//num에 근사한 2n승 값을 value로 저장한다
		N+=sib(n);//전역변수 N에 num을 이진수화한 값을 더하고
		binary(num-value);//다음작업:num가 value의 나머지로 재귀호출한다
	}
	
	public static int divisionNum(int num) {//num을 2로 몇번 나눌 수 있는 지 세는 메소드
		if(num==1) return 0;
		return 1+divisionNum(num/2);
	}
	
	public static int sib(int i) {//십진수로 이진수를 표현하기 위한 메소드
		if(i==0) return 1;
		return 10*sib(--i);
	}
}
