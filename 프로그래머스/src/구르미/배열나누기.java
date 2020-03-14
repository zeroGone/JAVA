package 구르미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 배열나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] temp = input.split(" ");

        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);
        int[] array = new int[N];
        temp = br.readLine().split(" ");

        for(int i=0; i<N; i++){
            array[i] = Integer.parseInt(temp[i]);
        }

        int[] cost = new int[N-1];
        for(int i=0; i<cost.length; i++){
            cost[i] = array[i+1] - array[i];
        }

        if(N==K) System.out.println(0);
        else if(K==1) System.out.println(array[array.length-1] - array[0]);
        else{
            int min = Integer.MAX_VALUE;
            for(int i=0; i<cost.length-K+1; i++){
                int sum = 0;
                for(int v:Arrays.copyOfRange(cost, i, i + K))
                    sum+=v;
                if(min>sum) min = sum;
            }
            System.out.println(min);
        }
    }
}
