/* 1157�� �ܾ����
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * �Է�:
 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. 
 * �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
 * ���:
 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String value = input.next();
		HashMap<Character, Integer> list = new HashMap();//���ڿ� ���ڰ� ���� ������ ������ �ؽ��� ����Ʈ
		
		value=value.toUpperCase();//����� ���� �빮�ڷ� ���ʱ�ȭ
		for(int i=0;i<value.length();i++) {
			if(!list.containsKey(value.charAt(i))) list.put(value.charAt(i), 0);//����Ʈ�� ������ ���� �ְ�
			else list.put(value.charAt(i), 1+list.get(value.charAt(i)));//�����ÿ��� ���ڰ� ���� ������ �ϳ� �����ش�
		}
		
		Iterator itr = list.keySet().iterator();//����Ʈ �˻縦 ���� ���ͷ����ͷ� ��ȯ
		
		char output = (char)itr.next();//����� ���� ������ ù ���ڷ� �ʱ�ȭ���ش�
		int num=list.get(output);//ù ������ ���� ������ �ʱ�ȭ���ְ�
		while(itr.hasNext()) {//�ִ밪 ã�� �˰���
			char ch= (char)itr.next();
			if(num<list.get(ch)) {
				num=list.get(ch);
				output=ch;
			}
			else if(num==list.get(ch)) output='?';//���� ������ ������ ����� ?�� �ʱ�ȭ
		}
		
		System.out.println(output);
	}

}