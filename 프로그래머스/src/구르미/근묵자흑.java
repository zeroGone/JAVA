package 구르미;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 근묵자흑 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] N = new int[Integer.parseInt(input.split(" ")[0])];
        int K = Integer.parseInt(input.split(" ")[1]);
        input = br.readLine();
        String[] Ninput = input.split(" ");
        for(int i=0; i<Ninput.length; i++){
            N[i]=Integer.parseInt(Ninput[i]);
        }

        for(int i=0; i<N.length; i++) {
            if (N[i] == 1) {
                N[i] = N[0];
                N[0] = 1;
                break;
            }
        }

        int index = 0;
        int num = 0;
        while(true){
            num++;
            if(index+K>=N.length) break;
            for(int i=0; i<K; i++){
                N[index++] = 1;
            }
            index--;
        }
        System.out.println(num);
    }
}
