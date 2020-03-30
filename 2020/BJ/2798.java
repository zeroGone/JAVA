import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        input = reader.readLine().split(" ");
        int[] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(input[i]);
        }

        int out = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(num[i]+num[j]>M) continue;
                for(int z=j+1; z<N; z++){
                    int sum = num[i]+num[j]+num[z];
                    if(sum > M) continue;
                    out = Math.max(out, sum);
                }
            }
        }

        System.out.println(out);
    }
}
