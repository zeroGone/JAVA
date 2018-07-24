/* 2577�� ������ ����
 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶��
 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 * �Է�:
 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. 
 * A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.
 * ���:
 * ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. 
 * ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
 * */

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private static HashMap<Integer, Integer> numMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int sum = A*B*C;
		
		number(sum);
		for(int i=0; i<10; i++) System.out.println(numMap.get(i));
	}
	
	private static void number(int N) {
		for(int i=0; i<10; i++) numMap.put(i, 0);//0���� 9���� ���ڸ� �ְ�
		int size=10;//10�� �ڸ������� �˻�
		while(size<N) {
			numMap.put(N/size%10,numMap.get(N/size%10)+1);
			size*=10;//10�辿 �ø�
		}
		numMap.put(N%10,numMap.get(N%10)+1);//���������� ���� �ڸ��� �˻�
	}
}