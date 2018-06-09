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
    	sum[0][0]=a[0][0];
    	for(int i=0; i<=r; i++) {
    		for(int j=0; j<=c; j++) {
    			if(i>0&&j>0) sum[i][j]=a[i][j]+Math.min(sum[i-1][j], sum[i][j-1]);
    			else if(i>0&&j==0) sum[i][j]=a[i][j]+sum[i-1][j];
    			else if(i==0&&j>0) sum[i][j]=a[i][j]+sum[i][j-1];
    			
    		}
    	}
    	return sum[r][c];
    }

	public static void main(String[] args) {
		System.out.println(점수(3,3));
		
		System.out.println(Arrays.toString(sum[0]));
		System.out.println(Arrays.toString(sum[1]));
		System.out.println(Arrays.toString(sum[2]));
		System.out.println(Arrays.toString(sum[3]));
	}

}
