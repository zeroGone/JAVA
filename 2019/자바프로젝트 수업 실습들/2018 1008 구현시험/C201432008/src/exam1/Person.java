package exam1;

public class Person {
	String name;
	String no;
	int year;
	double grade;
	
	public Person(String name, String no,int year, double grade) {
        this.name = name;
        this.no = no;
        this.year = year;
        this.grade = grade;
    }
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		if(this.name.equals(other.name)&&this.no.equals(other.no)&&this.year==other.year&&this.grade==other.grade) return true;
		else return false;
	}
}
