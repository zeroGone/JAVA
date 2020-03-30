package e2018.exam2;

public class Person {
	String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
    	return "{\""+name+"\", "+age+"}";
    }

    @Override
    public boolean equals(Object obj) {
    	Person other = (Person)obj;
		return this.name.equals(other.name)&&this.age==other.age;
    }
}
