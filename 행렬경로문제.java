/* �˰��� ��� ��� ����
 * ������� ������ n��n ����� �ִ�.
 * ����� �»�ܿ��� �����Ͽ� ���ϴܱ��� �̵��ϴ� ��θ� ã�´�.
 * �̵� ��� (��������)
 * �������̳� �Ʒ������θ� �̵��� �� �ִ�
 * ����, ����, �밢�� �̵��� ������� �ʴ´�
 * ��ǥ: ����� �»�ܿ��� �����Ͽ� ���ϴܱ��� �̵��ϴ� ��ε� �߿���
 * �湮�� ĭ�� �ִ� ������ ���� ���� �ּҰ��Ǵ� ��θ� ã�´�. */

public class Main {
    static int[][] a = { 
    		{ 6,  7, 12,  5 },
            { 5,  3, 11, 18 },
            { 7, 17,  3,  3 },
            { 8, 10, 14,  9 }};
    
    static int ����(int sum,int r,int c) {
    	System.out.printf("����(%d, %d) ", r, c);
    	if(r+1>=a.length&&c+1>=a[1].length) return sum+a[r][c];//������� +1�� �迭�� ũ�⺸�� ũ�� �迭�� ��ġ���� ���� ���Ͽ� ����
    	else if(r+1>=a.length&&c+1<a[1].length) return ����(sum+a[r][c],r,c+1);//���� +1�� �迭�� ũ�⺸�� ����� ��ġ���� ���� ���ϰ� ���� 1�� ���Ͽ� ���ȣ��
    	else if(r+1<a.length&&c+1>=a[1].length) return ����(sum+a[r][c],r+1,c);//���� +1 �迭�� ũ�⺸�� ����� ��ġ���� ���� ���ϰ� �࿡ 1�� ���Ͽ� ���ȣ��
    	else {//��� ���� 1�� ���� ���� �迭�� ũ�Ⱑ �ȹ����
    		if(a[r+1][c]<a[r][c+1]) return ����(sum+a[r][c],r+1,c);//��� ���� ���� 1�� ���Ѱ��� ���Ͽ� ���� �迭�� ���� �հ踦 ���ϰ� ���� ���� ��ġ�� ���ȣ��
    		else return ����(sum+a[r][c],r,c+1);//����
    	}
    }
    
    //�������� ¥�� ��
    static int[][] sumArray = new int[4][4];
    static int sum(int r, int c) {
        System.out.printf("����(%d, %d) ", r, c);
        if (sumArray[r][c] != 0) return sumArray[r][c];
        int �����ܰ����� = 0;
        if (r == 0 && c == 0) �����ܰ����� = 0;
        else if (r == 0) �����ܰ����� = sum(r, c-1);
        else if (c == 0) �����ܰ����� = sum(r - 1, c);
        else �����ܰ����� = Math.min(sum(r, c - 1), sum(r - 1, c));
        sumArray[r][c] = �����ܰ����� + a[r][c];
        return sumArray[r][c];
    }


	public static void main(String[] args) {
		System.out.println(����(0,0,0));
	}

}
