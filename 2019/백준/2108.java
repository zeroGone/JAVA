/* 2018번 통계학 카운팅정렬 이용
 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 
 * 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 
 * 단, N은 홀수라고 가정하자.
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최대값과 최소값의 차이
 * N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
 * 입력:
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
 * 그 다음 N개의 줄에는 정수들이 주어진다. 
 * 입력되는 정수의 절대값은 4,000을 넘지 않는다.
 * 출력:
 * 첫째 줄에는 산술평균을 출력한다. 
 * 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
 * 둘째 줄에는 중앙값을 출력한다.
 * 셋째 줄에는 최빈값을 출력한다. 
 * 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
 * 넷째 줄에는 범위를 출력한다.
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[] nums = new int[8001];//절대값고려 입력값범위 안에 숫자들을 위한 배열
		//음수들을 인덱스 4001부터
		
		for(int i=0; i<N; i++) {
			int value = input.nextInt();
			if(value<0) {
				value=-value+4000;
				nums[value]++;
			}
			else nums[value]++;
		}//배열에 추가
		
		double 산술평균 = 0;
		int count = -1;
		ArrayList 중앙값 = new ArrayList();
		ArrayList 최빈값 = new ArrayList();
		int 작은범위= Integer.MAX_VALUE; 
		int 큰범위 = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) //배열의 원소들 하나하나 본다
			for(int j=0; j<nums[i]; j++) {//숫자가 한번이상 등장했을경우
				int value = i;
				if(i>4000) value = -value+4000;//음수면 음수로 초기화
				if(count<=j) {//빈도값 측정
					if(count<j) {//만약 최다 빈도를 넘으면
						count=j;//초기화
						최빈값=new ArrayList();//최다빈도로 저장된 배열리스트 초기화
					}
					최빈값.add(value);//추가
				}
				중앙값.add(value);//중앙값을 알기위한 배열에 추가
				산술평균+=value;//평균구하기 위해서 다더함
				//범위측정을위해
				if(작은범위>value) 작은범위 = value;
				if(큰범위<value) 큰범위=value;
			}
		
		System.out.println(Math.round(산술평균/N));//음수일 경우 반올림이 반대로 됨을 방지
		중앙값.sort(null);//중앙값 배열정렬
		System.out.println(중앙값.get(중앙값.size()/2));
		최빈값.sort(null);//빈도 정렬
		if(최빈값.size()>1) System.out.println(최빈값.get(1));//두번째 출력
		else System.out.println(최빈값.get(0));
		System.out.println(큰범위-작은범위);
	}
}