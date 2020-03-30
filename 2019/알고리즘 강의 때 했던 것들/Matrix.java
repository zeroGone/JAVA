import java.util.Arrays;
import java.util.Objects;

//행렬 클래스
public class Matrix {
	int a[][];
	final int EMPTY = 0;
	int row, col;
	
	public Matrix(int a[][]) {
		this.a=a;
		this.col=a[0].length;
		this.row=a.length;
	}
	
     public Matrix(int row, int col) {
         this.row = row;
         this.col = col;
     }


	public int columnLength() {
		return col;
	}
	
	public int rowLength() {
		return row;
	}

	public static Matrix add(Matrix m1, Matrix m2) throws Exception {//다른 행렬과 더하는 메소드
		if(m1.columnLength()!=m2.columnLength()||m1.rowLength()!=m2.rowLength()) throw new Exception("행렬의 크기가 다름");
		else {
			for(int i=0; i<m1.a.length; i++) {
				for(int j=0; j<m1.a[0].length; j++) 
					m1.a[i][j]+=m2.a[i][j];
			}
			Matrix temp = new Matrix(m1.a);
			return temp;
		}
	}
	
	public static Matrix subtract(Matrix m1, Matrix m2) throws Exception {//다른 행렬과 더하는 메소드
		if(m1.columnLength()!=m2.columnLength()||m1.rowLength()!=m2.rowLength()) throw new Exception("행렬의 크기가 다름");
		else {
			for(int i=0; i<m1.a.length; i++) {
				for(int j=0; j<m1.a[0].length; j++) 
					m1.a[i][j]-=m2.a[i][j];
			}
			Matrix temp = new Matrix(m1.a);
			return temp;
		}
	}
	
	public static Matrix multiply(Matrix m1, Matrix m2) throws Exception {
		if(m1.columnLength()!=m2.rowLength()) throw new Exception("곱할 수 없음");
		else {
			int[][] array=new int[m1.columnLength()][m2.rowLength()];
			Matrix temp = new Matrix(array);
			for(int z=0; z<temp.columnLength(); z++) {
				int value = 0;
				for(int i=0; i<m1.columnLength(); i++) {
					for(int j=0; j<m1.rowLength(); j++) {
						value+=m1.a[z][j]*m2.a[j][i];
					}
					temp.a[z][i]=value;
					value=0;
				}
			}
			return temp;
		}
	}
	
	//교수님이 짜신 곱셈횟수최소값 구하는 메소드
	public static int[][] sum ;
	public static int 곱셈횟수최소값(Matrix[] a, int start, int end) throws Exception {
		if(sum==null) sum= new int[a.length][a.length];
		if (sum[start][end]!=0) return sum[start][end];
        if (start == end) return 0;
        System.out.printf("(%d, %d) ", start, end);
        int 최소값 = Integer.MAX_VALUE;
        for (int middle = start; middle < end; ++middle) {
            int 횟수 = 곱셈횟수최소값(a, start, middle);
            횟수 += 곱셈횟수최소값(a, middle + 1, end);
            횟수 += a[start].row * a[middle].col * a[end].col;
            if (횟수 < 최소값) 최소값 = 횟수;
        }
        return  sum[start][end]=최소값;
    }
	
	@Override 
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				str.append(a[i][j]+" ");
			}
			str.append("\n");
		}
		return str.toString();
	}
	
	@Override
	public int hashCode() {
		return Arrays.deepHashCode(a);
	}
	
	@Override
	public boolean equals(Object obj) {
		int[][] other = (int[][])obj;
		return Arrays.deepEquals(a, other);
	}
}
