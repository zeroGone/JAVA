package lecture3;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
	static void solution(int[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0||a[i]%3==0) {
				for(int j=i; j<a.length-1; j++) a[j]=a[j+1];
				a[a.length-1] = -1;
				i--;
			}
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[30];
		for (int i = 0; i < 30; ++i)
			a[i] = random.nextInt(8) + 1;
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
