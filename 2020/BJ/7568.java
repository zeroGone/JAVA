import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Human[] humans = new Human[N];

        for(int i=0; i<N; i++){
            String[] temp = reader.readLine().split(" ");
            humans[i] = new Human(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }

        for(int i = 0; i<N; i++){
            Human human = humans[i];

            for(int j = 0; j<N; j++){
                if(i == j) continue;

                Human compare = humans[j];

                int compareValue = compareHuman(human, compare);

                if(compareValue == -1) human.ranking ++;
            }
        }

        for(Human h:humans) System.out.print(h.ranking+" ");
    }


    static class Human{
        int height;
        int weight;
        int ranking;

        public Human(int height, int weight) {
            this.height = height;
            this.weight = weight;
            this.ranking = 1;
        }
    }

    private static int compareHuman(Human a, Human b){
        if(a.height > b.height && a.weight > b.weight) return 1;
        else if(a.height < b.height && a.weight < b.weight) return -1;
        else return 0;
    }


}
