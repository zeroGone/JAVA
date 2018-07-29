/* īī�� ������ �÷�����
 * ���ǻ��� �������� ����ġ�� �׿����� �÷����Ͽ� �� ��ȭ�� �׷��޶�� ��Ź�Ͽ� ���� ���� �׸��� �޾Ҵ�. 
 * ���� ���� �׸��� ���̵� ������ �÷����Ͽ� �ְ� �;��� ����ġ�� ������ ������ ��ĥ�ϱⰡ ��ٷο� ��������ٴ� ����� �߰��ϰ� �׸��� ���̵��� ������ ���� �����Ͽ���. 
 * (�����̶� �����¿�� ����� ���� ������ ������ �ǹ��Ѵ�.)
 * �׸��� �� ���� ������ �ִ����� ���� ū ������ ���̴� ������ ����ϴ� ���α׷��� �ۼ��غ���.
 * 
 * �Է�:
 * �Է��� �׸��� ũ�⸦ ��Ÿ���� m�� n, 
 * �׸��� �׸��� ��Ÿ���� m �� n ũ���� 2���� �迭 picture�� �־�����. ���������� �Ʒ��� ����.
 * 1 <= m, n <= 100
 * picture�� ���Ҵ� 0 �̻� 2^31 - 1 ������ ������ ���̴�.
 * picture�� ���� �� ���� 0�� ���� ��ĥ���� �ʴ� ������ ���Ѵ�.
 * ���:
 * ���� Ÿ���� ���Ұ� �� ���� ���� �迭�̴�. 
 * �׸��� �� ���� ������ �ִ����� ���� ū ������ �� ĭ���� �̷���� �ִ����� �����Ѵ�.
 * ��
 * m : 6	
 * n : 4	
 * picture	
 * [[1, 1, 1, 0], 
 * [1, 2, 2, 0], 
 * [1, 0, 0, 1], 
 * [0, 0, 0, 1], 
 * [0, 0, 0, 3], 
 * [0, 0, 0, 3]]	
 * answer
 * [4, 5]
 * */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static boolean[][] check;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[][] picture = {
				{1, 1, 1, 0}, 
				{1, 1, 1, 0}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 1}
		};
		check=new boolean[m][n];
		System.out.println(Arrays.toString(solution(m,n,picture)));
	}
	
	private static int area(int[][] picture,int num, int index1,int index2) {
		if(picture[index1][index2]!=num||check[index1][index2]==true) return 0;
		check[index1][index2]=true;
		int area = 1; 
		if(index1+1>=picture.length&&index2+1>=picture[0].length) return area;
		else if(index1+1>=picture.length&&index2+1<picture[0].length) area+=area(picture,num,index1,index2+1);
		else if(index1+1<picture.length&&index2+1>=picture[0].length) area+=area(picture,num,index1+1,index2);
		else area+=(area(picture,num,index1,index2+1)+area(picture,num,1+index1,index2));
		return area;
	}

	private static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(check[i][j]==false&&picture[i][j]!=0) {
					int area=area(picture,picture[i][j],i,j);
					if(area>0) numberOfArea++;
					if(area>maxSizeOfOneArea) maxSizeOfOneArea=area;
				}
			}
		}
		
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}
	
	
}