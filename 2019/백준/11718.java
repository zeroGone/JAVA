/* ���� �˰��� 11718��
 * �Է� �״�� ��� �ϱ�
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		
		int num=0;
		while(num<100) {
			String next="";
			//hasNextLine���� ���� �˻縦 �ؾ� �ƹ��͵� �Է����� �ʾ����� NoSuchElement ������ ���� �ʴ´�.
			if(input.hasNextLine())//�Է��� ���� ������ 
				next=input.nextLine();//�ʱ�ȭ ��Ų����
			//���ǰ˻�:���ڼ� 100�� ����, �������� ���� X, �������� ���� X, �ƹ��͵� �Է����� �ʾ�����
			if(next.length()>100||next.isEmpty()||next.startsWith(" ")||next.endsWith(" ")) break;
			str.add(next);
			num++;
		}
		
		for(int i=0; i<str.size(); i++) {
			System.out.print(str.get(i)+"\n");
		}
	}
}
