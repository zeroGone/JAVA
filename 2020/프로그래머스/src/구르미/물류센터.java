package 구르미;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class 물류센터 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] array = new int[N][N];
        for (int i = 1; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            int index = Integer.parseInt(temp[0]);
            int to = Integer.parseInt(temp[1]);
            int weight = Integer.parseInt(temp[2]);

            array[index][to] = weight;
            array[to][index] = weight;
        }

//        for (int i= 1; i<N; i++){
//            fo
//        }
        System.out.println(Arrays.deepToString(array));
    }
}
