package highscorekit.fullserach;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{ 3, 3, 1, 1, 2, 2})));
    }

    public static int[] solution(int[] answers) {
        int[] count = new int[3];

        //one
        int temp = 1;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == temp ) count[0]++;
            temp = temp % 5 == 0 ? 1 : temp + 1;
        }

        //two
        int[] array = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        temp = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == array[temp] ) count[1]++;
            temp = array.length-1 == temp ? 0 : temp + 1;
        }

        //three
        temp = 0;
        array = new int[]{3,1,2,4,5};
        for(int i=0; i<answers.length; i++){
            if(answers[i] == array[temp] ) count[2]++;
            temp = i % 2 == 1 ? array.length-1 == temp? 0 : temp + 1 : temp;
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int min = -1;
        for(int v:count) if(min<v) min = v;
        for(int i=0; i<3; i++) if(min==count[i]) answer.add(i+1);
        int[] a = new int[answer.size()];
        for(int i=0; i<a.length; i++) a[i] = answer.get(i);
        return a;
    }
}
