package K201432008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam14 {
	public static String[] solution(String[] a1, String[] a2) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(a1));
		list.addAll(Arrays.asList(a2));
		return list.toArray(new String[]{});
	}

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "c" };
		String[] a2 = { "B", "D", "C", "A" };
		String[] a3 = solution(a1, a2);
		System.out.println(Arrays.toString(a3));
	}
}
