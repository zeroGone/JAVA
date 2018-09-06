/*배열을 입력받은 값만큼 오른쪽으로 움직이는 것 */
package 과정지도;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6}; 
		solution(A, 3); 
		System.out.println(Arrays.toString(A));
	}
	
	public static void solution(int[] a,int k) {
		for(int i=0; i<k; i++) {
			int[] temp=new int[a.length];
			
			for(int j=0; j<a.length; j++) {
				temp[j]=a[j];
			}
			
			for(int z=0; z<a.length; z++) {
				if(z==0) a[z]=temp[temp.length-1];
				else a[z]=temp[z-1];
			}
		}
	}
}
