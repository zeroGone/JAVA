/* 1152�� �ܾ��� ���� 
 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. 
 * �� ���忡�� �� ���� �ܾ ������? 
 * �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ������ �־�����. 
 * �� ������ ���̴� 1,000,000�� ���� �ʴ´�. 
 * �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����.
 * ���:
 * ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 * */

//���� ¥������ ����
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList<>();
		
		String sentence = input.nextLine();
		
		StringBuilder builder = new StringBuilder();
		
		//ù��°�� �����϶�, �ι�°�� �����϶� ó���ؾ��ߴ�
		for(int i=0; i<sentence.length(); i++) {
			char word = sentence.charAt(i);
			if(word==' '&&i!=0) {
				wordList.add(builder.toString());
				builder.delete(0, builder.length());
			}else if(i==sentence.length()-1&&word!=' ') {
				builder.append(word);
				wordList.add(builder.toString());
			}
			else builder.append(word);
		}
		
		System.out.println(wordList.size());
	}
}

