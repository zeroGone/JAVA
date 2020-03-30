package 구르미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class 문제선정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int[] values = Arrays.asList(reader.readLine().split(" "))
                .stream().mapToInt(Integer::parseInt).toArray();
        Arrays.sort(values);
        Set<Integer> set = Arrays.stream(values).boxed().collect(Collectors.toSet());

        if(set.size()>=3) System.out.println("YES");
        else System.out.println("NO");

        reader.close();
    }
}
