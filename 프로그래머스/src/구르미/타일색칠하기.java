package 구르미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일색칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int T = Integer.parseInt(input);

        boolean[] output = new boolean[T];
        for (int i = 0; i < T; i++) {
            input = br.readLine();
            String[] temp = input.split(" ");
            int N = Integer.parseInt(temp[0]);
            int M = Integer.parseInt(temp[1]);

            int[][] array = new int[N][M];
            for (int j = 0; j < N; j++) {
                temp = br.readLine().split(" ");
                for (int z = 0; z < M; z++) {
                    array[j][z] = Integer.parseInt(temp[z]);
                }
            }

            output[i] = check(array);
        }

        for(boolean b:output){
            if(b) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(int[][] a) {
        boolean c = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == 1) {
                    c = false;
                    break;
                }
            }
        }
        if(c) return true;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                if (a[i][j] == 1 && a[i + 1][j + 1] == 1 && a[i][j + 1] == 1 && a[i + 1][j] == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
