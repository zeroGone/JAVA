/* 15552번 빠른 A+B
 * 문제:
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
 * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 * Java를 사용하고 있다면, 
 * Scanner와 System.out.println 대신 
 * BufferedReader와 BufferedWriter를 사용할 수 있다. 
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 * 입력:
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
 * 다음 T줄에는 각각 두 정수 A와 B가 주어진다. 
 * A와 B는 1 이상, 1,000 이하이다.
 * 출력:
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		//빠른 입력을 위한 BufferedReader, 파라미터로 InputStreamReader 들어간다
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader 객체로 한줄을 읽는다 read() 메소드는 한글자씩 읽으므로 readLine()을 사용
		//String으로 받아온 리턴값을 int형으로 변환
		int T=Integer.parseInt(input.readLine());
		
		int[] A = new int[T];
		int[] B = new int[T];
		
		for(int i=0; i<T; i++) {
			String temp=input.readLine();//먼저 한 줄을 받아오고 
			StringBuilder bd = new StringBuilder();//그 줄에 숫자들을 만들기 위한 StringBuilder 객체
			int j=0;//읽어온 줄의 인덱스를 위한 변수
			
			while(j<temp.length()) {//첫번째 숫자를 읽어오기 위한 반복문
				if(temp.charAt(j)=='\n'||temp.charAt(j)=='\r'||temp.charAt(j)==' ') break;
				bd.append(temp.charAt(j));//위 조건이 아닐경우 StringBuilder 객체에 temp의 한 글자씩 추가한다
				j++;
			}
			j++;//위 반복문의 break 났을 경우 공백이나 줄바꿈에 멈춰있으므로 인덱스 값을 하나 늘려준다
			
			A[i]=Integer.parseInt(bd.toString());//StringBuilder에 쌓인 문자들을 String으로 바꿔주고 int형으로 바꾸면 첫번째 숫자
			bd.delete(0, bd.length());//StringBuilder 초기화
			
			while(j<temp.length()) {//두번째 숫자를 읽어오기 위한 반복문
				bd.append(temp.charAt(j));
				j++;
			}
			
			B[i]=Integer.parseInt(bd.toString());//위와 동일
		}
		
		//빠른 출력을 위한 BufferedWriter, 파라미터로 OutputStreamWriter 들어간다
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<T; i++) {
			//출력의 경우 write() 메소드에 문자열이 안들어가는 경우 이상한 값이 나오므로 형변환 필수
			//BufferedWriter 클래스는 자동 줄바꿈 메소드가 없다
			output.write(Integer.toString((A[i]+B[i]))+"\n");
		}
		
		//버퍼입출력 클래스들은 사용후 닫아주는게 안전
		//출력의 경우 flush를 한번해야지 이상한 값이 안나옴
		input.close();
		output.flush();
		output.close();
	}
}