package skillcheck.level1;

public class Exercise2 {
    static long[] array;
    public static void main(String[] args) {
        System.out.println(solution( 121));
    }

    public static long solution(long n) {
        int value = (int)Math.sqrt(n);
        for(long i=0; i<=value; i++){
            if(i*i==n) return (i+1)*(i+1);
        }
        return -1;
    }
}
