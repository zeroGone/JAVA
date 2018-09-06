/* 행렬 경로 문제 구현
 * 동적 프로그래밍 
 * */
public class Main {
	
	static int[][] a = { 
			{ 6,  7, 12,  5 },
            { 5,  3, 11, 18 },
            { 7, 17,  3,  3 },
            { 8, 10, 14,  9 } };

	public static void main(String[] args) {
		System.out.println(minSum2(a,3,3));
	}
	
	static int[][] sum;
	
	static int minSum(int[][] array,int r, int c) {//재귀로 구현
		System.out.println("("+r+","+c+")");
		if(sum==null) sum=new int[array.length][array[0].length];
		
		if(sum[r][c]!=0) return sum[r][c];
		if(c==0&&r==0) sum[r][c]=array[r][c];
		else if(c==0) sum[r][c]=array[r][c]+minSum(array,r-1,c);
		else if(r==0) sum[r][c]=array[r][c]+minSum(array,r,c-1);
		else sum[r][c]=array[r][c]+Math.min(minSum(array,r,c-1), minSum(array,r-1,c));
		
		return sum[r][c];
	}
	
	static int minSum2(int[][] array,int c,int r) {//반복문으로 구현
		if(sum==null) sum=new int[array.length][array[0].length];
		for(int i=0; i<=c; i++) {
			for(int j=0; j<=r; j++) {
				if(i==0&&j==0) sum[i][j]=array[i][j];
				else if(i==0) sum[i][j]=array[i][j]+sum[i][j-1];
				else if(j==0) sum[i][j]=array[i][j]+sum[i-1][j];
				else sum[i][j]=array[i][j]+Math.min(sum[i-1][j], sum[i][j-1]);
			}
		}
		return sum[c][r];
	}
}
