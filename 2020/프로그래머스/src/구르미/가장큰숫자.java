package 구르미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 가장큰숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[]{6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        String input = br.readLine();
        int N = Integer.parseInt(input);

        int[] n = new int[array.length];
        int max = 0;
        int index = 0;
        for(int i=array.length-1; i>=0; i--){
            n[i] = N/array[i];
            if(max<N/array[i]){
                max = N/array[i];
                index = i;
            }
        }

        long output = index;
        for(long i=1; i<max; i++){
            output+= index*Math.pow(10, i);
        }
        System.out.println(output);
    }
}
