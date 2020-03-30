/* 2920�� ����
 * �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. 
 * �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. 
 * c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
 * ������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�:
 * ù° �ٿ� 8�� ���ڰ� �־�����. 
 * �� ���ڴ� ���� ������ ������ ���̸�, 1���� 8���� ���ڰ� �� ���� �����Ѵ�.
 * ���:
 * ù° �ٿ� ascending, descending, mixed �� �ϳ��� ����Ѵ�.
 * */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[8];
		
		for(int i=0; i<numbers.length; i++) 
			numbers[i]=input.nextInt();
		
		int standard = numbers[0];
		String ���� = "";
		if(standard==1) ����="ascending";
		else if(standard==8) ����="descending";
		
		System.out.println(�˻�(����,standard,numbers,1));
	}
	
	private static String �˻�(String ����,int standard, int[] numbers,int index ) {
		if(index>=numbers.length) return ����;
		
		if(����.equals("ascending")) {
			if(numbers[index]==++standard) return �˻�(����,standard,numbers,++index);
		}else if(����.equals("descending")) {
			if(numbers[index]==--standard) return �˻�(����,standard,numbers,++index);
		}
		return "mixed";
	}
}

