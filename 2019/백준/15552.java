/* 15552�� ���� A+B
 * ����:
 * ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. 
 * ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
 * Java�� ����ϰ� �ִٸ�, 
 * Scanner�� System.out.println ��� 
 * BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
 * �Է�:
 * ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. 
 * ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. 
 * A�� B�� 1 �̻�, 1,000 �����̴�.
 * ���:
 * �� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		//���� �Է��� ���� BufferedReader, �Ķ���ͷ� InputStreamReader ����
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader ��ü�� ������ �д´� read() �޼ҵ�� �ѱ��ھ� �����Ƿ� readLine()�� ���
		//String���� �޾ƿ� ���ϰ��� int������ ��ȯ
		int T=Integer.parseInt(input.readLine());
		
		int[] A = new int[T];
		int[] B = new int[T];
		
		for(int i=0; i<T; i++) {
			String temp=input.readLine();//���� �� ���� �޾ƿ��� 
			StringBuilder bd = new StringBuilder();//�� �ٿ� ���ڵ��� ����� ���� StringBuilder ��ü
			int j=0;//�о�� ���� �ε����� ���� ����
			
			while(j<temp.length()) {//ù��° ���ڸ� �о���� ���� �ݺ���
				if(temp.charAt(j)=='\n'||temp.charAt(j)=='\r'||temp.charAt(j)==' ') break;
				bd.append(temp.charAt(j));//�� ������ �ƴҰ�� StringBuilder ��ü�� temp�� �� ���ھ� �߰��Ѵ�
				j++;
			}
			j++;//�� �ݺ����� break ���� ��� �����̳� �ٹٲ޿� ���������Ƿ� �ε��� ���� �ϳ� �÷��ش�
			
			A[i]=Integer.parseInt(bd.toString());//StringBuilder�� ���� ���ڵ��� String���� �ٲ��ְ� int������ �ٲٸ� ù��° ����
			bd.delete(0, bd.length());//StringBuilder �ʱ�ȭ
			
			while(j<temp.length()) {//�ι�° ���ڸ� �о���� ���� �ݺ���
				bd.append(temp.charAt(j));
				j++;
			}
			
			B[i]=Integer.parseInt(bd.toString());//���� ����
		}
		
		//���� ����� ���� BufferedWriter, �Ķ���ͷ� OutputStreamWriter ����
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<T; i++) {
			//����� ��� write() �޼ҵ忡 ���ڿ��� �ȵ��� ��� �̻��� ���� �����Ƿ� ����ȯ �ʼ�
			//BufferedWriter Ŭ������ �ڵ� �ٹٲ� �޼ҵ尡 ����
			output.write(Integer.toString((A[i]+B[i]))+"\n");
		}
		
		//��������� Ŭ�������� ����� �ݾ��ִ°� ����
		//����� ��� flush�� �ѹ��ؾ��� �̻��� ���� �ȳ���
		input.close();
		output.flush();
		output.close();
	}
}