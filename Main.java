/*int�� �迭�� �ּڰ� ã�� findMin �޼ҵ� ����*/
public class Main {

	public static void main(String[] args) {
		int[] array = {6,4,10,1,457,20};
		
		System.out.print("�ּڰ�:"+findMin(array));
	}
	
	public static int findMin(int[] array) {
		int min = array[0];//�迭�� �ּڰ��� ������ min ���� 
		for(int i=1; i<array.length; i++) {
			if(min>array[i])
				min=array[i];
		}
		return min;
	}
}
