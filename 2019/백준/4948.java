/* 4948번 베르트랑 공준 
 * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
 * 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
 * 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. 
 * (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
 * n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
 * 입력:
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
 * 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
 * 입력의 마지막에는 0이 주어진다.
 * 출력:
 * 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		while(true) {
			int value = input.nextInt();
			if(value>0) n.add(value);
			else break;
		}
		
		int[] count = new int[n.size()];
		for(int i=0; i<n.size(); i++) {
			int value = n.get(i);
			boolean[] check = new boolean[2*value+1];
			
			for(int j=2; j<check.length; j++) check[j]=true;
			
			for(int j=2; j<check.length; j++) {
				if(check[j]) {
					for(int z=2; j*z<check.length; z++) {
						check[j*z]=false;
					}
				}
			}
			
			for(int j=value+1; j<=value*2; j++) {
				if(check[j]) count[i]++;
			}
		}
		
		for(int i=0; i<count.length; i++) System.out.println(count[i]);
	}
}