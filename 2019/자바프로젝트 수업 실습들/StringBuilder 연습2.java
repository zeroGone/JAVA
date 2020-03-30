public class Main {
    static String toString(String[] a) {
    	StringBuilder b = new StringBuilder();
    	b.append("{");
    	for(String str:a) {
    		b.append("\""+str+"\", ");
    	}
    	b.delete(b.length()-2, b.length());
    	b.append("}");
    	return b.toString();
    }
    
    public static void main(String[] args) {
        String[] a = { "one", "two", "three", "four" };
        String s = toString(a);
        System.out.println(s);
    }



}

