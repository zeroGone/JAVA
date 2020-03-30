package exam1;

public class Exam08 {

	static int sum(int[][] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				count+=a[i][j];
			}
		}
		return count;
    }

    public static void main(String[] args) {
        int[][] a1 = { {1, 3, 6}, {2, 6, 3}, {6, 9, 10} };
        int[][] a2 = { {5, 4, 1}, {10, 8, 3}, {7, 2, 6} };

        System.out.println(sum(a1));
        System.out.println(sum(a2));
    }

}
