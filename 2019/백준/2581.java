/* 2581�� �Ҽ�
 * �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּҰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, 
 * �̵� �Ҽ��� ���� 620�̰�, �ּҰ��� 61�� �ȴ�.
 * �Է�:
 * �Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
 * M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����
 * ���:
 * M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּҰ��� ����Ѵ�. 
 * ��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> �Ҽ� = new ArrayList<Integer>();
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		for(int i=M; i<=N; i++) {
			int j=2;
			for(; j<i; j++) {
				if(i%j==0) break; 
			}
			if(j==i) �Ҽ�.add(i);
		}
		
		int sum = 0;
		for(int i:�Ҽ�) sum+=i;
		
		if(�Ҽ�.size()==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(�Ҽ�.get(0));
		}
		
	}
}