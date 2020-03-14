package highscorekit.dfsbfs;

public class 타겟넘버 {
    public static void main(String[] args) {
        solution(new int[]{1,1,1,1,1}, 3);
    }

    public static int solution(int[] numbers, int target) {
        int answer = search(numbers, true, 0, 0, target)+search(numbers, false, 0, 0, target);
        return answer;
    }

    public static int search(int[] numbers, boolean plus, int value, int i, int target){
        if(plus) value += numbers[i];
        else value -= numbers[i];
        if(i==numbers.length-1){
            if(value==target) return 1;
            else return 0;
        }
        return search(numbers, true, value, i+1, target) + search(numbers, false, value, i+1, target);
    }
}
