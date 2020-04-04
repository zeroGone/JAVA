import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int i = N == 1? 666 : 1665;
        int a = 1;
        while(a!=N){
            i++;
            int num = 0;
            if(i%10 == 6) num++;
            for(int j=10; j<i; j*=10){
                if(i/j%10 == 6) num ++;
                else if(num>=3) break;
                else num = 0;
            }
            if(num>=3) a++;
        }
        System.out.println(i);
    }
}
