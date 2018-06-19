/* 행렬 경로 문제 구현
 * 동적 프로그래밍 
 * */
public class Main {
	
    static int[][] a = {
            {  6,  7, 12, -5, 5,  3, 11, 3 },
            { -8, 10, 14,  9, 7, 13,  8, 5 },
            { 11, 12,  7,  4, 8, -2,  9, 4 }};


	public static void main(String[] args) throws Exception {
		System.out.println(maxSum2(a,7));
	}
	
	static int[][] sum;
	
	static int maxSum(int[][] array,int c) throws Exception {
		if(sum==null) sum=new int[array[0].length][5];
		
		int max=Integer.MIN_VALUE;
		for(int p=1; p<5; p++) {
			int value=sum(array,c,p);
			if(max<value) max=value; 
		}
		
		return max;
	}
	
	static int sum(int[][] array, int c, int p) throws Exception {//재귀로 구현
		if(sum[c][p]!=0) return sum[c][p];
		
 		if(c==0) sum[c][p]=pattern(array,c,p);
 		else {
 			for(int i=1; i<5; i++) {
 				if(patternCheck(p,i)) sum[c][p]=pattern(array,c,p)+sum(array,c-1,i);
 			}
 		}
 		
		return sum[c][p];
	}

	static int maxSum2(int[][] array, int c) throws Exception {//반복문으로 구현
		if(sum==null) sum=new int[array[0].length][5];
		
		for(int i=1; i<5; i++) {
			sum[0][i]=pattern(array,0,i);
		}
		
		for(int i=1; i<=c; i++) {
			for(int j=1; j<5; j++) {
				int value=Integer.MIN_VALUE;
				for(int z=1; z<5; z++) {
					if(patternCheck(j,z)) {
						if(value<sum[i-1][z]) value=sum[i-1][z];
					}
				}
				sum[i][j]=value+pattern(array,i,j);
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int p=1; p<5; p++) {
			int value=sum[c][p];
			if(max<value) max=value; 
		}
		
		return max;
	}
	
	static int pattern(int[][] array,int c,int p) throws Exception {
		switch(p) {
		case 1: return array[0][c];
		case 2: return array[1][c];
		case 3: return array[2][c];
		case 4: return array[2][c]+array[0][c];
		}
		throw new Exception("패턴 잘못됨");
	}
	
	static boolean patternCheck(int p1, int p2) {
		if(p1==p2) return false;
		int[][] check = {{1,4},{4,1},{3,4},{4,3}};
		for(int i=0; i<4; i++) {
			if(check[i][0]==p1&&check[i][1]==p2) return false;
		}
		return true;
	}
}
