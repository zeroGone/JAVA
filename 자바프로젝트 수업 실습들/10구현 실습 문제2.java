/* 배열:[11, 13, 17, 20]  합계:61
 * 배열:[21, 33, 17, 40, 5, 13]  합계:129
 * 위와 같이 출력되도록 printSum 메소드 구현
 * */


import java.util.Arrays;

public class Main {

    static void printSum(int... a) {
    	int sum=0;
    	for(int i=0; i<a.length; i++) sum+=a[i];
    	System.out.println("배열:"+Arrays.toString(a)+"  합계:"+Integer.toString(sum));
    }

    public static void main(String[] args) {
        int[] a = new int[] { 21, 33, 17, 40, 5, 13 };

        printSum( 11, 13, 17, 20 );
        printSum( a );
    }
}
