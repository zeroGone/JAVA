/* 4344번 평균은 넘겠지
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
 * 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 입력:
 * 첫째 줄에는 테스트케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
 * 이어서 N명의 점수가 주어진다. 
 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력:
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째자리까지 출력한다.
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int C = input.nextInt();//테스트케이스 개수 받아오고
		int[][] testCase = new int[C][];//학생수만큼의 점수들을 받아오기 위한 2차원배열
		
		for(int i=0; i<testCase.length; i++) {
			int N = input.nextInt();//학생수 받고
			testCase[i]=new int[N];//학생수만큼의 배열 생성
			for(int j=0; j<testCase[i].length; j++) {
				testCase[i][j]=input.nextInt();//점수 다받음
			}
		}
		
		double[] avg = new double[C];//평균값들을 저장할 배열
		for(int i=0; i<testCase.length; i++) {
			double sum=0;//총합
			for(int j=0; j<testCase[i].length; j++) {
				sum+=testCase[i][j];
			}
			avg[i]=sum/testCase[i].length;
		}
		
		int[] stuNum = new int[C];//평균을 넘는 학생수들을 저장할 배열
		for(int i=0; i<testCase.length; i++) {
			for(int j=0; j<testCase[i].length; j++) {
				if(avg[i]<(double)testCase[i][j]) stuNum[i]++;
			}
		}
		//반올림하여 소수점 셋째자리 출력하는거
		//printf출력에서 %을 출력하기위해선 %%을 써야한다
		//반올림하는 방법은 이외에도 Math.round를 쓰면됨
		//귀찮아죽겠다
		for(int i=0; i<testCase.length; i++) {
			System.out.printf("%.3f%%\n",(double)stuNum[i]/(double)testCase[i].length*100);
		}
		
		
	}

}
