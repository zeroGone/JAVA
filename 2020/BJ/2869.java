import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = reader.readLine().split(" ");
        int A = Integer.parseInt(temp[0]);
        int B = Integer.parseInt(temp[1]);
        int V = Integer.parseInt(temp[2]);
        V-=A;
        if(V%(A-B)==0) System.out.println(V/(A-B)+1);
        else System.out.println(V/(A-B)+2);

    }
}
