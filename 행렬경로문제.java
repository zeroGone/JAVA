import java.util.Arrays;

/* 알고리즘 행렬 경로 문제
 * 정수들로 구성된 n×n 행렬이 있다.
 * 행렬의 좌상단에서 시작하여 우하단까지 이동하는 경로를 찾는다.
 * 이동 방법 (제약조건)
 * 오른쪽이나 아래쪽으로만 이동할 수 있다
 * 왼쪽, 위쪽, 대각선 이동은 허용하지 않는다
 * 목표: 행렬의 좌상단에서 시작하여 우하단까지 이동하는 경로들 중에서
 * 방문한 칸에 있는 수들을 더한 값이 최소가되는 경로를 찾는다. */

public class Main {
    static int[][] a = { 
    		{ 6,  7, 12,  5 },
            { 5,  3, 11, 18 },
            { 7, 17,  3,  3 },
            { 8, 10, 14,  9 }};
    
    static int sum[][]= new int[4][4];//동적 프로그래밍을 위한 이차원 배열
    
    static int 점수(int r,int c) {
    	if(sum[r][c]!=0) return sum[r][c];//동적프로그래밍:이미 호출되어 합계가 저장되어 있으면 그 값으로 리턴
    	//종료조건
    	//1.왼쪽 칸이 없는 경우 윗쪽 칸의 점수와 현재 점수를 더하여 리턴
    	if(r>0&&c==0) return 점수(r-1,c)+a[r][c];
    	//2.윗쪽 칸이 없는 경우 왼쪽 칸의 점수와 현재 점수를 더하여 리턴
    	if(r==0&&c>0) return 점수(r,c-1)+a[r][c];
    	//3.둘다 없는 경우 현재 점수 리턴
    	if(r==0&&c==0) return a[r][c];
    	
    	//현재 단계 작업
    	//이전 칸 두 칸  점수(r-1,c)와 (r,c-1) 중 최소값을 더 현재 값과 더하여 리턴
    	int 이전점수 = Math.min(점수(r-1,c), 점수(r,c-1));
    	sum[r][c]=이전점수+a[r][c];//동적프로그래밍:이전점수와 현재점수를 더하여 배열에 저장하고
    	return sum[r][c];//그 값을 리턴
    }

	public static void main(String[] args) {
		System.out.println(점수(3,3));
		
		System.out.println(Arrays.toString(sum[0]));
		System.out.println(Arrays.toString(sum[1]));
		System.out.println(Arrays.toString(sum[2]));
		System.out.println(Arrays.toString(sum[3]));
	}

}
