/* 4948�� ����Ʈ�� ���� 
 * ����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
 * �� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
 * ���� ���, 10���� ũ��, 20���� �۰ų� ���� �Ҽ��� 4���� �ִ�. 
 * (11, 13, 17, 19) ��, 14���� ũ��, 28���� �۰ų� ���� �Ҽ��� 3���� �ִ�. (17,19, 23)
 * n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. 
 * �� ���̽��� n�� �����ϸ�, �� �ٷ� �̷���� �ִ�. (n �� 123456)
 * �Է��� ���������� 0�� �־�����.
 * ���:
 * �� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		while(true) {
			int value = input.nextInt();
			if(value>0) n.add(value);
			else break;
		}
		
		int[] count = new int[n.size()];
		for(int i=0; i<n.size(); i++) {
			int value = n.get(i);
			boolean[] check = new boolean[2*value+1];
			
			for(int j=2; j<check.length; j++) check[j]=true;
			
			for(int j=2; j<check.length; j++) {
				if(check[j]) {
					for(int z=2; j*z<check.length; z++) {
						check[j*z]=false;
					}
				}
			}
			
			for(int j=value+1; j<=value*2; j++) {
				if(check[j]) count[i]++;
			}
		}
		
		for(int i=0; i<count.length; i++) System.out.println(count[i]);
	}
}