/* 10989번 수정렬3 카운팅절렬
 * 자바는 다른 언어들보다 느려서 Scanner를 쓰면 시간초과라 나오는 문제.
 * 카운팅 정렬에 대해 알게된 문제 처음엔 MashMap써서 해보려했지만 틀렸다고 자꾸나와
 * 인터넷보고 걍참고하여 걍 배열로 만들어 품.
 * 입력:
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 * 출력:
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
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