package highscorekit.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 체육복 {
    public static void main(String[] args) {
        System.out.println(solution(5,
                new int[]{2, 4},
                new int[]{3}
        ));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        List<Integer> l = Arrays.stream(lost).boxed().collect(Collectors.toList());

        boolean[] b = new boolean[n];

        for (int i : reserve) {
            if (l.contains(i)) l.remove(l.indexOf(i));
            else b[i - 1] = true;
        }

        int answer = n;

        for (int i = 0; i < l.size(); i++) {
            int index = l.get(i) - 1;

            if (b[index]) b[index] = false;
            else {
                if (index != b.length - 1 && b[index + 1]) b[index + 1] = false;
                else if (index != 0 && b[index - 1]) b[index - 1] = false;
                else answer--;
            }
        }

        return answer;
    }
}
