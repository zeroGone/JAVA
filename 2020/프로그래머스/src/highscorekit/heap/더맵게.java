package highscorekit.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class 더맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 8, 2, 10, 4, 6, 7, 1, 9, 5}, 7));
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        int answer = 0;
        while(!q.isEmpty()){
            int min1 = q.poll();
            if(q.isEmpty()&&min1<K){
                answer=0;
                break;
            }
            if(min1 >= K || q.isEmpty()) break;
            int min2 = q.poll();
            q.add(min1+min2*2);
            answer++;
        }
        return answer==0? -1: answer;
    }
}
