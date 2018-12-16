package lecture2;

import java.util.Arrays;

public class Example3 {

    static void solution(int[] a) {
        // 배열 a에서 2의 배수와 3의 배수를 모두 제거하고
        // 제거된 항목의 뒷 항목들을 앞으로 당겨야 한다.
        // 제거된 항목 때문에 생간 배열 뒤의 공간에 -1을 채워라
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
