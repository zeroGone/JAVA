/* 10989�� ������3 ī��������
 * �ڹٴ� �ٸ� ���麸�� ������ Scanner�� ���� �ð��ʰ��� ������ ����.
 * ī���� ���Ŀ� ���� �˰Ե� ���� ó���� MashMap�Ἥ �غ��������� Ʋ�ȴٰ� �ڲٳ���
 * ���ͳݺ��� �������Ͽ� �� �迭�� ����� ǰ.
 * �Է�:
 * ù° �ٿ� ���� ���� N(1 �� N �� 10,000,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. 
 * �� ���� 10,000���� �۰ų� ���� �ڿ����̴�.
 * ���:
 * ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		
		int[] array = new int[100001];
		
		for(int i=0; i<N; i++) array[Integer.parseInt(input.readLine())]++;
		
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<array.length; i++)
			for(int j=0; j<array[i]; j++) output.write(i+"\n");
		
		input.close();
		output.flush();
		output.close();
	}
}