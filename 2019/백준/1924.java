/* 1924��
 * ������ 2007�� 1�� 1�� �������̴�. 
 * �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? 
 * �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. 
 * ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 
 * 4, 6, 9, 11���� 30�ϱ���, 
 * 2���� 28�ϱ��� �ִ�.
 * ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		String[] ���� = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=1; i<=x; i++) {
			if(i==2||i==4||i==6||i==8||i==9||i==11) y+=31;
			else if(i==3) y+=28;
			else if(i==5||i==7||i==10||i==12) y+=30;
		}
		
		System.out.println(����[y%7]);
	}
}