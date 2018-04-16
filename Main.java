/*int형 배열의 최솟값 찾는 findMin 메소드 구현*/
public class Main {

	public static void main(String[] args) {
		int[] array = {6,4,10,1,457,20};
		
		System.out.print("최솟값:"+findMin(array));
	}
	
	public static int findMin(int[] array) {
		int min = array[0];//배열의 최솟값을 저장할 min 변수 
		for(int i=1; i<array.length; i++) {
			if(min>array[i])
				min=array[i];
		}
		return min;
	}
}
