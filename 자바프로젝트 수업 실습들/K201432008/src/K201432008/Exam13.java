package K201432008;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Exam13 {

    static class Data {
        private int i;
        private String s;
        public Data(int i, String s) {
            this.i = i;
            this.s = s;
        }
        
        @Override
        public boolean equals(Object obj) {
        	if(obj instanceof Data == false) return false;
        	Data other = (Data)obj;
        	return this.i==other.i&&Objects.equals(this.s, other.s);
        }
        
        @Override
        public int hashCode() {
        	return Objects.hash(i, s);
        }
        
        @Override
        public String toString() {
        	return String.format("Data(%d, %s)", i, s);
        }

    }

    public static void solution(Data[] a) {
    	Map<Data, Integer> map = new HashMap<>();
    	for(Data data:a) {
    		if(map.containsKey(data)) map.put(data, map.get(data)+1);
    		else map.put(data, 1);
    	}
    	
    	for(Data data:map.keySet()) 
    		System.out.println(String.format("%s = %dȸ", data, map.get(data)));
    }

    public static void main(String[] args) {
        Data[] a = new Data[] {
            new Data(1, "a"), new Data(2, "b"), new Data(1, "a"), new Data(1, "a"),
            new Data(2, "b"), new Data(1, "c"), new Data(2, "b"), new Data(2, "a"),
            new Data(1, "c"), new Data(2, "a"), new Data(1, "a"), new Data(1, "b")
        };
        solution(a);
    }
}
