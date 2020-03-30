/* Arrays 클래스 강의자료 과제
 * Integer 객체가 여러 개 들어있는 배열을 생성하라.  
 * 예: Integer[] a = new Integer[] { 10, 3, 5, 2, 8 };
 * 그 배열을 정렬하라.
 * 그 배열에 어떤 값이 들어있는지 이진 탐색으로 확인하라.
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
