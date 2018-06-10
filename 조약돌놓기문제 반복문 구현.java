import java.util.Arrays;

/* 3행 n열
 * 조약돌 놓기 문제
 *  
 * 제약조건
 * -각 열에 적어도 하나의 조약돌
 * -가로 세로 인접한 조약돌 놓을 수 없음
 * */
public class Main {
	public static int[][] array={
        {  6,  7, 12, -5, 5,  3, 11, 3 },
        { -8, 10, 14,  9, 7, 13,  8, 5 },
        { 11, 12,  7,  4, 8, -2,  9, 4 }};
	
	public static void main(String[] args) {
		System.out.println(column_HighScore(7));
		
		for(int i=0;i<8;i++) {
			System.out.println(Arrays.toString(sum[i]));
		}
		
	}
	
	//전체 점수를 구하는 메소드
	//파라미터로 만든 c열의 최고점수를 구하여 리턴한다
	public static int column_HighScore(int c) {
		int highScore = Integer.MIN_VALUE;//최고 점수를 저장하기 위한 변수 Integer의 가장 작은 값으로 초기화
		for(int p=1; p<=4; p++) {//패턴 4가지를 전부 검사
			int score = entryScore(c,p);//변수하나를 선언해 하나의 패턴의 전체 점수를 구하여 초기화한다
			if(highScore<score) highScore=score;//만약 최고점수보다 그 패턴의 점수가 크면 최고점수에 초기화
		}
		return highScore;//최고 점수 리턴
	}
	
	//각 행은 각 열들을 뜻하고 각 열은 배열의 열들의 패턴을 뜻함.
	static int[][] sum = new int[8][4];
	
	public static int entryScore(int c,int p) {
		for(int i=0; i<4; i++) {
			sum[0][i]=pattern(0,i+1);
		}
		if(c!=0) {
			for(int i=1; i<=c; i++) {
				for(int j=1; j<=4; j++) {
					for(int p2=1; p2<=4; p2++) {
						int score = Integer.MIN_VALUE;
						if(patternCheck(j,p2)) {
							if(score<sum[i-1][p2-1]) {
								sum[i][j-1]=pattern(i,j)+sum[i-1][p2-1];
								score = sum[i-1][p2-1];
							}
						}
					}
				}
			}
		}
		return sum[c][p-1];
	}
	
	//파라미터로 받은 c열의 p 패턴의 점수를 구하여 리턴하는 메소드
	public static int pattern(int c,int p) {
		int score = 0;
		switch(p) {
		case 1: score=array[0][c]; break;//패턴 1 c열의 첫번째 원소
		case 2: score=array[1][c]; break;//패턴 2 c열의 두번째 원소
		case 3: score=array[2][c]; break;//패턴 3 c열의 세번째 원소
		case 4: score=array[0][c]+array[2][c];break;//패턴4 c열의 첫번째원소와 세번째 원소
		}
		return score;
	}
	
	
	public static boolean patternCheck(int p1, int p2) {//두 패턴이 가능한지 검사
		if(p1==p2) return false;//같은 패턴이면 인접하므로 불가
		int[][] temp = {{1,4},{3,4},{4,1},{4,3}};//패턴 검사를 위한 이차원 배열 temp = 이 배열들은 인접하므로 불가능한 패턴들이다
		for(int i=0; i<temp.length; i++) {
			if(p1==temp[i][0]&&p2==temp[i][1]) return false;//p1과 p2가 불가능한 패턴들이면 false 리턴
		}
		return true;
	}

}
