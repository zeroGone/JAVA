/* 1110�� ���ϱ� ����Ŭ
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
			int �����ڸ���=value/10;
			int �����ڸ���=value%10;
			int temp = �����ڸ���+�����ڸ���;
			value=�����ڸ���*10+temp%10;
			num++;
			if(value==N) break;
		}
		return num;
	}
}