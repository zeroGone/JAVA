package e2018.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam15 {

	static void sort(int[] a) {
		Arrays.sort(a);
	}

	static int[] insert(int[] a, int value) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) list.add(a[i]);
		if(!list.contains(value)) list.add(value);
		a = new int[list.size()];
		for(int i=0; i<list.size(); i++) a[i]=list.get(i);
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 3, 8, 1, 2, 4, 5, 7 };

		sort(a);
		System.out.println(Arrays.toString(a));

		a = insert(a, 2);
		a = insert(a, 6);
		System.out.println(Arrays.toString(a));
	}

}
