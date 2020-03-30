package lecture3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
    	return String.format("Person(\"%s\",%d)", name, age);
    }
}

public class Example3 {

    static void sort1(List<Person> list) {
    	list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.name.compareTo(arg1.name);
			}
    		
    	});
    }

    static void sort2(List<Person> list) {
    	list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return -arg0.name.compareTo(arg1.name);
			}
    		
    	});

    }

    static void sort3(List<Person> list) {
    	list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.age-arg1.age;
			}
    		
    	});
    }

    static void sort4(List<Person> list) {
    	list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return -(arg0.age-arg1.age);
			}
    		
    	});
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("È«±æµ¿", 18));
        list.add(new Person("ÀÓ²©Á¤", 19));
        list.add(new Person("Àü¿ìÄ¡", 20));
        sort1(list);
        System.out.println(list.toString());
        sort2(list);
        System.out.println(list.toString());
        sort3(list);
        System.out.println(list.toString());
        sort4(list);
        System.out.println(list.toString());
    }
}