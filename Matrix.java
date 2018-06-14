import java.util.Arrays;
import java.util.Objects;

//행렬 클래스
public class Matrix {
	int a[][];
	final int EMPTY = 0;
	
	public Matrix(int a[][]) {
		this.a=a;
	}
	
	public int columnLength() {
		return a.length;
	}
	
	public int rowLength() {
		return a[0].length;
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
