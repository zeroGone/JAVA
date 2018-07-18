/* 1110번 더하기 사이클
 * 
 * */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		System.out.println(cycle(N));
	}
	
	private static int cycle(int N) {
		int value = N;
		int num=0;
		while(true) {
			int 십의자리수=value/10;
			int 일의자리수=value%10;
			int temp = 십의자리수+일의자리수;
			value=일의자리수*10+temp%10;
			num++;
			if(value==N) break;
		}
		return num;
	}
}