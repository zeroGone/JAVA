/* 1874�� ���� ����
 * ���� (stack)�� �⺻���� �ڷᱸ�� �� �ϳ���, ��ǻ�� ���α׷��� �ۼ��� �� ���� �̿�Ǵ� �����̴�. 
 * ������ �ڷḦ �ִ� (push) �Ա��� �ڷḦ �̴� (pop) �Ա��� ���� ���� ���� �� �ڷᰡ ���� ���߿� ������ (FILO, first in last out) Ư���� ������ �ִ�.
 * 1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�. 
 * �� ��, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����. 
 * ������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, �ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�. 
 * �̸� ����ϴ� ���α׷��� �ۼ��϶�.
 * �Է�:
 * ù �ٿ� n (1 �� n �� 100,000)�� �־�����. 
 * ��° �ٺ��� n���� �ٿ��� ������ �̷�� 1�̻� n������ ������ �ϳ��� ������� �־�����. 
 * ���� ���� ������ �� �� ������ ���� ����.
 * ���:
 * �Էµ� ������ ����� ���� �ʿ��� ������ �� �ٿ� �� ���� ����Ѵ�. 
 * push������ +��, pop ������ -�� ǥ���ϵ��� �Ѵ�. 
 * �Ұ����� ��� NO�� ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		int[] ���� = new int[N];
		
		for(int i=0;i<����.length; i++) ����[i] = input.nextInt();
		
		ArrayList<String> output = new ArrayList<String>();
		boolean[] �������� = new boolean[N+1];
		Stack<Integer> stack = new Stack<Integer>();
		
		int value = 0;
		for(int i:����) {
			if(��������[i]) {
				value=-1;
				break;
			}
			
			while(value<i) {
				if(!��������[++value]) {
					output.add("+");
					stack.add(value);
				}
			}
			
			while(value>=i) {
				if(!��������[value]) {
					output.add("-");
					��������[value]=true;
				}
				value--;
			}
		}
		
		if(value==-1) System.out.println("NO");
		else {
			for(String i:output) System.out.println(i);
		}
		
	}
}