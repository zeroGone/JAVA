package K201432008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam09 {
	public static String[] insert(String[] a, int index, String s) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(a));
		list.add(index, s);
		return list.toArray(new String[]{});
	}

	public static void main(String[] args) {
		String[] a = {"a", "c", "d", "f", "g", "h"};
		a = insert(a, 1, "b");
		a = insert(a, 4, "e");
		System.out.println(Arrays.toString(a));
	}
}
