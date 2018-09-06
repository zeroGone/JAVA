/* 피보나치 수열 구현
 * 동적프로그래밍을 이용하여
 * 재귀호출의 중복호출을 제거했음
 * */
public class Main {
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}
	
	static int[] array = new int[100];//중복호출을 제거하기 위한 값들을 저장하는 배열
	
	public static int fibonacci(int num) {
		if(array[num]!=0) return array[num];//이미 한번 호출하여 값이 있는 원소는 그 값을 리턴
		if(num==1||num==2)  return array[num]=1;//1번째와 2번째 값들은 1로 저장하고 리턴
		return array[num]=fibonacci(num-1)+fibonacci(num-2);//1번째와 2번째만 아니면 피보나치수열로 저장하고 리턴
	}
}
