/* 1929�� �Ҽ� ���ϱ�
 * M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1��M��N��1,000,000)
 * ���:
 * �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		boolean[] �Ҽ� = new boolean[N+1];
		
		for(int i=2; i<=N; i++) �Ҽ�[i]=true;
		
		for(int i=2; i<=N; i++) {
			if(�Ҽ�[i]) {
				for(int j=2; i*j<=N; j++) �Ҽ�[i*j]=false;
			}
			
		}
		
		for(int i=M; i<=N; i++) {
			if(�Ҽ�[i]) {
				System.out.println(i);
			}

		}
		
	}
	
}