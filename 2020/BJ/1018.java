import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = reader.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] board = new String[N];
        for(int i=0; i<N; i++) board[i] = reader.readLine();

        //나는 무식하다
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                int a = check(board, true, i, j);
                if(min>a) min = a;
                a = check(board, false, i, j);
                if(min>a) min = a;
            }
        }

        System.out.println(min);

    }

    private static int check(String[] board, boolean 기준, int index1, int index2){
        int num = 0;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if((index1+i+index2+j)%2 == 0){
                    if(기준){
                        if(board[index1+i].charAt(index2+j) == 'B') num++;
                    }else{
                        if(board[index1+i].charAt(index2+j) == 'W') num++;
                    }
                }else{
                    if(기준){
                        if(board[index1+i].charAt(index2+j) == 'W') num++;
                    }else{
                        if(board[index1+i].charAt(index2+j) == 'B') num++;
                    }
                }
            }
        }
        return num;
    }
}
