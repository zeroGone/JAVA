package lecture2;

import java.util.Arrays;

public class Example3 {

    static void solution(int[] a) {
        // �迭 a���� 2�� ����� 3�� ����� ��� �����ϰ�
        // ���ŵ� �׸��� �� �׸���� ������ ��ܾ� �Ѵ�.
        // ���ŵ� �׸� ������ ���� �迭 ���� ������ -1�� ä����
    	for(int i=0; i<a.length; i++) {
    		if(a[i]%2==0||a[i]%3==0) {
    			for(int j=i; j<a.length-1; j++) a[j]=a[j+1];
    			a[a.length-1]=-1;
    			i--;
    		}
    	}
 
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7};
        System.out.println(Arrays.toString(a));
        solution(a);
        System.out.println(Arrays.toString(a));
    }
}
