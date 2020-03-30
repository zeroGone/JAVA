/* 1181 �ܾ� ����
 * ���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���̰� ª�� �ͺ���
 * ���̰� ������ ���� ������
 * �Է�:
 * ù° �ٿ� �ܾ��� ���� N�� �־�����. (1��N��20,000) 
 * ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����.
 * �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
 * ���:
 * ���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. 
 * ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		String[] words = new String[N];
		
		for(int i=0; i<words.length; i++) words[i]=input.next();
		
		ArrayList<String> values = new ArrayList<String>();
		
		for(String i:words) {
			if(!values.contains(i)) {//���� �ܾ ������ ����
				values.add(i);//�߰��ϰ�
				values.sort(new Comparator<String>() {//����
					@Override
					public int compare(String o1, String o2) {
						if(o1.length()<o2.length()) return -1;//���̰� ª���� -1
						else if(o1.length()==o2.length()) {//���̰� ������
							for(int i=0; i<o1.length(); i++) {//�ܾ��ϳ��ϳ���
								if(o1.charAt(i)<o2.charAt(i)) return -1;
								else if(o1.charAt(i)>o2.charAt(i)) return 1;
							}
						}
						return 1;
					}
				});
			}
		}
		
		for(String i:values) System.out.println(i);
	}
}