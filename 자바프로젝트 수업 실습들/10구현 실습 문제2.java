/* �迭:[11, 13, 17, 20]  �հ�:61
 * �迭:[21, 33, 17, 40, 5, 13]  �հ�:129
 * ���� ���� ��µǵ��� printSum �޼ҵ� ����
 * */


import java.util.Arrays;

public class Main {

    static void printSum(int... a) {
    	int sum=0;
    	for(int i=0; i<a.length; i++) sum+=a[i];
    	System.out.println("�迭:"+Arrays.toString(a)+"  �հ�:"+Integer.toString(sum));
    }

    public static void main(String[] args) {
        int[] a = new int[] { 21, 33, 17, 40, 5, 13 };

        printSum( 11, 13, 17, 20 );
        printSum( a );
    }
}
