/* Arrays Ŭ���� �����ڷ� ����
 * Integer ��ü�� ���� �� ����ִ� �迭�� �����϶�.  
 * ��: Integer[] a = new Integer[] { 10, 3, 5, 2, 8 };
 * �� �迭�� �����϶�.
 * �� �迭�� � ���� ����ִ��� ���� Ž������ Ȯ���϶�.
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	Integer[] a = new Integer[] { 10, 3, 5, 2, 8 };
    	Arrays.sort(a);
    	System.out.println(Arrays.binarySearch(a, 0));
    	System.out.println(Arrays.toString(a));
    }
}
