/* 1427번 소트인사이드
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 입력:
 * 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 출력:
 * 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
	
		ArrayList<Integer> 자리수 = new ArrayList();
		
		int 자리 = 1;
		while(자리<=N) {
			자리수.add(N/자리%10);
			자리*=10;
		}
		
		int[] 정렬 = new int[자리수.size()];
		for(int i:자리수) for(int j=0; j<정렬.length; j++) {
			if(정렬[j]<i) {
				for(int z=정렬.length-1; z>j; z--) {
					정렬[z]=정렬[z-1];
				}
				정렬[j]=i;
				break;
			}
		}
		
		int output = 0;
		자리 = 정렬.length-1;
		for(int i=0; i<정렬.length; i++) {
			output += 정렬[i]*Math.pow(10,자리);
			자리-=1;
		}
			
		System.out.println(output);
	}
}