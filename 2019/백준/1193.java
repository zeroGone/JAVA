/* 1193 분수찾기 
 * 재귀쓰니까 런타임 에러떴다..
 *
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과
 * 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * 입력:
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * 출력:
 * 첫째 줄에 분수를 출력한다.
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		System.out.println(분수(N));
	}
	

	private static String 분수(int N) {
		if(N==1) return "1/1";
		else if(N==2) return "1/2";
		int num = 2;
		
		int 분자 = 1;
		int 분모 = 2;
		String 방향 = "끝";
		for(int i=2; i!=N; i++) {
			if(방향.equals("끝")) {
				if(분자==1) {
					++분자;
					--분모;
					방향="분모";
				}else {
					--분자;
					++분모;
					방향="분자";
				}
			}else {
				if(방향.equals("분모")) {
					if(분모==1) {
						++분자;
						방향="끝";
					}else {
						++분자;
						--분모;
						방향="분모";
					}
				}else {
					if(분자==1) {
						++분모;
						방향="끝";
					}else {
						--분자;
						++분모;
						방향="분자";
					}
					
				}
			}
		}
		return Integer.toString(분자)+"/"+Integer.toString(분모);
	}
	}