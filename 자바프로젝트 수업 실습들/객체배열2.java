import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	Object[][] objects = new Object[3][];
    	
    	objects[0] = new Double[3];
    	objects[0][0] = 1.1;
    	objects[0][1] = 2.2;
    	objects[0][2] = 3.3;

    	objects[1] = new String[3];
    	objects[1][0] = "a";
    	objects[1][1] = "b";
    	objects[1][2] = "c";
    	
    	Person person = new Person("¿”≤©¡§",22);
    	objects[2] = new Person[2];
    	objects[2][0] = person;
    	objects[2][1] = person;

    	System.out.println(Arrays.deepToString(objects));
    }

}
class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

