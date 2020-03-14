package 구르미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 숫자카드게임 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();


        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        int[] indexes = new int[K];
        for (int i = 0; i < K; i++) indexes[i] = i;

        int value = 0;
        int index = indexes[K - 1];

        int temp = K - 1;

        int p = 1;
        int t = 1;
        while (true) {
            if (temp == 0) {
                for (int i = 0; i < K; i++) indexes[i] = p++;
                p = ++t;
                index = K - 1;
                temp = K - 1;
            }

            System.out.println(Arrays.toString(indexes) + " " + index + " " + temp + " " + t);

            if (t == K || temp == -1) break;
            int sum = 0;
            for (int j = 0; j < K; j++) sum += indexes[j];
            if (sum % N == 0) {
                value++;
                System.out.println(value);
            }


            indexes[index] += 1;
            if (indexes[index] == N - 1 || (index != K - 1 && indexes[index] == indexes[index + 1] - 1)) {
                index = --temp;
            }
        }

        System.out.println(value);
    }
}
