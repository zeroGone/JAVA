/* 피보나치 수열 구현
 * 동적 프로그래밍 
 * */
public class Main {

	public static void main(String[] args) {
		System.out.println(fibo(10));
	}
	
	static int sum[] = new int[100];
	
	static int fibonacci(int n) {
		System.out.println("fibo("+n+") ");
		if(sum[n]!=0) return sum[n];
		if(n==1||n==2) return sum[n]=1;
		return sum[n]=fibonacci(n-1)+fibonacci(n-2);
	}
	
	static int fibo(int n) {//반복문으로 구현
		sum[1]=1;
		sum[2]=1;
		for(int i=3; i<=n; i++) {
			sum[i]=sum[i-1]+sum[i-2];
		}
		return sum[n];
	}
}
