package e2018.exam2;

public class Exam10 {
	static int sum(int[][] a) {
		int value = 0;
		for(int i=0; i<a.length; i++) 
			for(int j=0; j<a[i].length; j++) value+=a[i][j];
		return value;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {
            { 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8, 9 }
        };
        System.out.println(sum(a));
    }

}
