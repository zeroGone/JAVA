/* 10828�� ����
 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����� �� �ټ� �����̴�.
 * push X: ���� X�� ���ÿ� �ִ� �����̴�.
 * pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
 * empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
 * top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * �Է�:
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. 
 * �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. 
 * ������ �������� ���� ����� �־����� ���� ����.
 * ���:
 * ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static String[] ��ɾ� = new String[] {
			"push","pop","size","empty","top"
	};
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		String[] ��ɾ�� = new String[N];
		
		for(int i=0; i<N; i++) ��ɾ��[i]=input.nextLine();
		
		ArrayList<Integer> stack = new ArrayList<Integer>();
		for(String value:��ɾ��) {
			String temp = value.substring(0, 2);
			int i= 0;
			for(;i<��ɾ�.length; i++) {
				if(temp.equals(��ɾ�[i].substring(0, 2))) break;
			}
			
			if(i==0) {
				stack.add(Integer.parseInt(value.substring(5)));
			}
			else if(i==1) {
				if(stack.size()!=0) {
					System.out.println(stack.get(stack.size()-1));
					stack.remove(stack.size()-1);
				}
				else System.out.println(-1);
			}
			else if(i==2) System.out.println(stack.size());
			else if(i==3) {
				if(stack.size()==0) System.out.println(1);
				else System.out.println(0);
			}
			else if(i==4) {
				if(stack.size()!=0) System.out.println(stack.get(stack.size()-1));
				else System.out.println(-1);
			}
		}
	}
}