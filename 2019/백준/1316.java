/* 1316�� �׷�ܾ�üĿ
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. 
 * ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. 
 * ��°�ٺ��� N���� �ٿ� �ܾ ���´�. 
 * �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 * ���:
 * ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		String[] words = new String[num];
		
		for(int i=0; i<words.length; i++)
			words[i]=input.next();
		
		System.out.println(groupWord(words));
	}
	
	private static int groupWord(String[] words) {
		int num=0;
		for(int i=0; i<words.length; i++) {
			if(check(words[i])) num++;
		}
		return num;
	}
	
	private static boolean check(String word) {
		ArrayList<Character> words = new ArrayList();
		Character check = ' ';
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(check!=ch) {
				if(words.contains(ch)) return false;
				else {
					words.add(ch);
					check=ch;
				}
			}
		}
		
		return true;
	}
}

