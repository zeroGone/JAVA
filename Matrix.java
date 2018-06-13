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

	public Matrix add(Matrix other) throws Exception {//다른 행렬과 더하는 메소드
		if(this.columnLength()!=other.columnLength()||this.rowLength()!=other.rowLength()) throw new Exception("행렬의 전체 크기가 다름");
		else {
			int[][] array=new int[this.columnLength()][other.rowLength()];
			Matrix temp = new Matrix(array);
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[0].length; j++) 
					temp.a[i][j]=this.a[i][j]+other.a[i][j];
			}
			return temp;
		}
	}
	
	public Matrix subtract(Matrix other) throws Exception {//다른 행렬과 빼는 메소드
		if(this.columnLength()!=other.columnLength()||this.rowLength()!=other.rowLength()) throw new Exception("행렬의 전체 크기가 다름");
		else {
			int[][] array=new int[this.columnLength()][other.rowLength()];
			Matrix temp = new Matrix(array);
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[0].length; j++) 
					temp.a[i][j]=this.a[i][j]-other.a[i][j];
			}
			return temp;
		}
	}
	
	public Matrix multiply(Matrix other) throws Exception {
		if(this.rowLength()!=other.columnLength()) throw new Exception("곱할 수 없음");
		else {
			int[][] array=new int[this.columnLength()][other.rowLength()];
			Matrix temp = new Matrix(array);
			for(int z=0; z<temp.columnLength(); z++) {
				int value = 0;
				for(int i=0; i<a.length; i++) {
					for(int j=0; j<a[0].length; j++) {
						value+=a[z][j]*other.a[j][i];
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
