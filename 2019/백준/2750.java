/* 2750 수정렬1
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력:
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
 * 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 * 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력:
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * */
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int[] array = new int[N];
		
		for(int i=0; i<array.length; i++) array[i]=input.nextInt();
		
		for(int i=array.length-1; i>=0; i--) {
			int max = i ;
			for(int j=0; j<i; j++) 
				if(array[max]<array[j]) max=j;
			
			int temp = array[max];
			array[max]=array[i];
			array[i]=temp;
		}
		
		for(int i=0; i<array.length; i++) System.out.println(array[i]);

	}
	
}