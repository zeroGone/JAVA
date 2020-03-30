package 구르미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사은품교환하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Long[] answer = new Long[T];
        for(int i=0; i<T; i++){
            String str = br.readLine();
            Long N = Long.parseLong(str.split(" ")[0]);
            Long K = Long.parseLong(str.split(" ")[1]);

            Long sum = (N+K)/12;
            Long p = N/5;
            answer[i] = sum>p?p:sum;
        }

        for(Long i:answer){
            System.out.println(i);
        }

        br.close();
    }
}
