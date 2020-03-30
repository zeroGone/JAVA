/* 피보나치 수열 구현
 * 동적프로그래밍을 이용하여
 * 반복문으로 구현
 * */
public class Main {
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
	
	static int[] array = new int[100];
	
	public static int fibonacci(int num) {
		array[1]=array[2]=1;
		for(int i=3; i<=num; i++) {
			array[i]=array[i-1]+array[i-2];
		}
		
		return array[num];
	}
}
