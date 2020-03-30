package skillcheck.level1;

public class Exercise1{
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        long value = num;
        for(int i=0; i<500; i++){
            if(value==1) return i;
            value = value%2 == 0 ? value/=2 : value*3+1;
        }
        return -1;
    }
}
