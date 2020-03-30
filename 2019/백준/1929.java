/* 1929번 소수 구하기
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * 입력:
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1≤M≤N≤1,000,000)
 * 출력:
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();
		int N = input.nextInt();
		
		boolean[] 소수 = new boolean[N+1];
		
		for(int i=2; i<=N; i++) 소수[i]=true;
		
		for(int i=2; i<=N; i++) {
			if(소수[i]) {
				for(int j=2; i*j<=N; j++) 소수[i*j]=false;
			}
			
		}
		
		for(int i=M; i<=N; i++) {
			if(소수[i]) {
				System.out.println(i);
			}

		}
		
	}
	
}