import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sol = solution(N);
        System.out.println(sol == N? 0 : sol);
    }

    public static int solution(int N){
        int a = N-N/10;
        while(true){
            int temp = a;
            temp += a % 10;

            for(int i=10; i<N; i*=10)
                temp += (a / i % 10);

            if(temp == N || a == N) break;
            a++;
        }
        return a;
    }
}
