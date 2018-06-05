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
    
    static int 점수(int sum,int r,int c) {
    	System.out.printf("점수(%d, %d) ", r, c);
    	if(r+1>=a.length&&c+1>=a[1].length) return sum+a[r][c];//행과열의 +1이 배열의 크기보다 크면 배열의 위치값과 합을 더하여 리턴
    	else if(r+1>=a.length&&c+1<a[1].length) return 점수(sum+a[r][c],r,c+1);//행의 +1이 배열의 크기보다 벗어나면 위치값과 합을 더하고 열에 1을 더하여 재귀호출
    	else if(r+1<a.length&&c+1>=a[1].length) return 점수(sum+a[r][c],r+1,c);//열의 +1 배열의 크기보다 벗어나면 위치값과 합을 더하고 행에 1을 더하여 재귀호출
    	else {//행과 열에 1을 더한 값이 배열의 크기가 안벗어나면
    		if(a[r+1][c]<a[r][c+1]) return 점수(sum+a[r][c],r+1,c);//행과 열에 각각 1을 더한값을 비교하여 현재 배열의 값과 합계를 더하고 작은 값의 위치로 재귀호출
    		else return 점수(sum+a[r][c],r,c+1);//같음
    	}
    }
    
    //교수님이 짜신 것
    static int[][] sumArray = new int[4][4];
    static int sum(int r, int c) {
        System.out.printf("점수(%d, %d) ", r, c);
        if (sumArray[r][c] != 0) return sumArray[r][c];
        int 이전단계점수 = 0;
        if (r == 0 && c == 0) 이전단계점수 = 0;
        else if (r == 0) 이전단계점수 = sum(r, c-1);
        else if (c == 0) 이전단계점수 = sum(r - 1, c);
        else 이전단계점수 = Math.min(sum(r, c - 1), sum(r - 1, c));
        sumArray[r][c] = 이전단계점수 + a[r][c];
        return sumArray[r][c];
    }


	public static void main(String[] args) {
		System.out.println(점수(0,0,0));
	}

}
