/* 10845�� ť
 * ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����� �� ���� �����̴�.
 * push X: ���� X�� ť�� �ִ� �����̴�.
 * pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * size: ť�� ����ִ� ������ ������ ����Ѵ�.
 * empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
 * front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * �Է�:
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
 * ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. 
 * �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. 
 * ������ �������� ���� ����� �־����� ���� ����.
 * ���:
 * ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 * */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	private static String[] ��ɾ�� = new String[] {
			"push","pop","size","empty","front","back"
	};
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		input.nextLine();
		
		String[] cases = new String[N];
		
		Queue queue = new LinkedList();
		
		for(int i=0; i<cases.length; i++) cases[i]=input.nextLine();
		
		for(String i:cases) {
			String check = i.substring(0,2);
			if(check.equals(��ɾ��[0].substring(0, 2))) {
				int value = Integer.parseInt(i.substring(5));
				queue.add(value);
			}else if(check.equals(��ɾ��[1].substring(0, 2))) {
				if(queue.isEmpty()) System.out.println(-1);
				else System.out.println(queue.poll());
			}else if(check.equals(��ɾ��[2].substring(0, 2))) {
				System.out.println(queue.size());
			}else if(check.equals(��ɾ��[3].substring(0, 2))) {
				if(queue.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}else if(check.equals(��ɾ��[4].substring(0, 2))) {
				if(queue.isEmpty()) System.out.println(-1);
				else System.out.println(queue.peek());
			}else if(check.equals(��ɾ��[5].substring(0, 2))) {
				if(queue.isEmpty()) System.out.println(-1);
				else {
					Object[] temp = queue.toArray();
					System.out.println(temp[queue.size()-1]);
				}
			}
		}
	}
}