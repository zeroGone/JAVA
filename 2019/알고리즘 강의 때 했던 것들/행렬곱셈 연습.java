import java.util.Arrays;

/* 행렬 곱셈 문제
 * 동적 프로그래밍 
 * 이승진교수님은 천재같다
 * */
public class Main {

    static class Matrix {
        int row, col;

        public Matrix(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static int sum[][];
    
    static int 곱셈횟수최소값(Matrix[] a, int start, int end) {
    	if(start>=end) return 0;
    	
    	if(sum[start][end]!=0) return sum[start][end];
    	int 최소값=Integer.MAX_VALUE;
    	for(int middle=start; middle<end; middle++) {
    		int 횟수=곱셈횟수최소값(a,start,middle);
    		횟수+=곱셈횟수최소값(a,middle+1,end);
    		횟수+=a[start].row*a[middle].col*a[end].col;
    		if(최소값>횟수) 최소값=횟수;
    	}
    	return sum[start][end]=최소값;
    }
    
    static int[][] 최소값저장;
    static int 곱셈횟수최소값2(Matrix[] a) {
        최소값저장 = new int[a.length][a.length];
        for (int distance = 1; distance < a.length; ++distance)
        for (int start = 0; start < a.length - distance; ++start) {
            int end = start + distance;
            최소값저장[start][end] = Integer.MAX_VALUE;
            for (int middle = start; middle < end; ++middle) {
                int 횟수 = 최소값저장[start][middle];
                횟수 += 최소값저장[middle + 1][end];
                횟수 += a[start].row * a[middle].col * a[end].col;
                if (횟수 < 최소값저장[start][end]) 최소값저장[start][end] = 횟수;
            }
        }
        return 최소값저장[0][a.length-1];
    }

    
	public static void main(String[] args) throws Exception {
        Matrix[] a = new Matrix[] { new Matrix(10, 100), new Matrix(100, 5), new Matrix(5, 50),
                new Matrix(50, 3), new Matrix(3, 8), new Matrix(8, 30) };
        sum=new int[a.length][a.length];
        System.out.println(곱셈횟수최소값2(a));
        System.out.println(Arrays.deepToString(최소값저장));
	}
}
