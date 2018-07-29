/* 카카오 프렌즈 컬러링북
 * 출판사의 편집자인 어피치는 네오에게 컬러링북에 들어갈 원화를 그려달라고 부탁하여 여러 장의 그림을 받았다. 
 * 여러 장의 그림을 난이도 순으로 컬러링북에 넣고 싶었던 어피치는 영역이 많으면 색칠하기가 까다로워 어려워진다는 사실을 발견하고 그림의 난이도를 영역의 수로 정의하였다. 
 * (영역이란 상하좌우로 연결된 같은 색상의 공간을 의미한다.)
 * 그림에 몇 개의 영역이 있는지와 가장 큰 영역의 넓이는 얼마인지 계산하는 프로그램을 작성해보자.
 * 
 * 입력:
 * 입력은 그림의 크기를 나타내는 m과 n, 
 * 그리고 그림을 나타내는 m × n 크기의 2차원 배열 picture로 주어진다. 제한조건은 아래와 같다.
 * 1 <= m, n <= 100
 * picture의 원소는 0 이상 2^31 - 1 이하의 임의의 값이다.
 * picture의 원소 중 값이 0인 경우는 색칠하지 않는 영역을 뜻한다.
 * 출력:
 * 리턴 타입은 원소가 두 개인 정수 배열이다. 
 * 그림에 몇 개의 영역이 있는지와 가장 큰 영역은 몇 칸으로 이루어져 있는지를 리턴한다.
 * 예
 * m : 6	
 * n : 4	
 * picture	
 * [[1, 1, 1, 0], 
 * [1, 2, 2, 0], 
 * [1, 0, 0, 1], 
 * [0, 0, 0, 1], 
 * [0, 0, 0, 3], 
 * [0, 0, 0, 3]]	
 * answer
 * [4, 5]
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static boolean[][] check;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] picture = {
				{1, 1, 1, 0}, 
				{1, 1, 1, 0}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 1}
		};
		check=new boolean[m][n];
		System.out.println(Arrays.toString(solution(m,n,picture)));
	}
	
	private static int area(int[][] picture,int num, int index1,int index2) {
		if(picture[index1][index2]!=num||check[index1][index2]==true) return 0;
		check[index1][index2]=true;
		int area = 1; 
		if(index1+1>=picture.length&&index2+1>=picture[0].length) return area;
		else if(index1+1>=picture.length&&index2+1<picture[0].length) area+=area(picture,num,index1,index2+1);
		else if(index1+1<picture.length&&index2+1>=picture[0].length) area+=area(picture,num,index1+1,index2);
		else area+=(area(picture,num,index1,index2+1)+area(picture,num,1+index1,index2));
		return area;
	}

	private static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(check[i][j]==false&&picture[i][j]!=0) {
					int area=area(picture,picture[i][j],i,j);
					if(area>0) numberOfArea++;
					if(area>maxSizeOfOneArea) maxSizeOfOneArea=area;
				}
			}
		}
		
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
	
	
}