/* 8958 OX����
 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
 * O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
 * ���� ���, 10�� ������ ������ 3�� �ȴ�.
 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. 
 * ���ڿ��� O�� X������ �̷���� �ִ�.
 * ���:
 * �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
 * */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		String[] testcase = new String[T];
		for(int i=0; i<testcase.length; i++) {
			testcase[i]=input.next();
		}
		
		for(int i=0; i<testcase.length; i++)
			System.out.println(score(testcase[i]));
	}
	
	private static int score(String value) {
		int sum=0;
		int score=0;
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i)=='O') sum+=++score;
			else score=0;
		}
		return sum;
	}
}

