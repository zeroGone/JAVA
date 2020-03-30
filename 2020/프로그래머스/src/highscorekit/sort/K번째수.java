package highscorekit.sort;


import java.util.Arrays;
import java.util.stream.Collectors;

public class K번째수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{
                new int[]{2, 5, 3},
                new int[]{4, 4, 1},
                new int[]{1, 7, 3}})));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<=commands.length-1; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int[] temp = new int[end-start+1];

            for(int j=0; j<temp.length; j++){
                temp[j]=array[start++];
            }

            System.out.println(Arrays.toString(temp));
            answer[i] = Arrays.stream(temp).boxed().sorted().collect(Collectors.toList()).get(commands[i][2]-1);
        }
        return answer;
    }
}
