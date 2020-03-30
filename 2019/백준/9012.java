/* 9012 ��ȣ
 * ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
 * �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. 
 * �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. 
 * ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. 
 * �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. 
 * ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
 * �������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
 * �Է�:
 * �Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. 
 * �Է��� T���� �׽�Ʈ �����ͷ� �־�����. 
 * �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. 
 * �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. 
 * �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�.
 * ���:
 * ����� ǥ�� ����� ����Ѵ�. 
 * ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
 * */

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		input.nextLine();
		
		String[] cases = new String[T];
		for(int i=0; i<cases.length; i++) cases[i]=input.nextLine();
		
		boolean[] check = new boolean[T];
		for(int i=0; i<cases.length; i++) {
			String value=cases[i];
			
			int count = 0;
			for(int j=0; j<value.length(); j++) {
				char temp = value.charAt(j);
				if(temp=='(') count++;
				else {
					count--;
					if(count<0) break;
				}
			}
			
			if(count==0) check[i]=true;
		}
		
		for(boolean i:check) {
			if(i) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}