package Generic;

public class withGeneric {

	public static void main(String[] args) {
		Person<String> strPerson = new Person<>("30세");
		Person<Integer> intPerson = new Person<>(20);
		Person<Double> doublePerson = new Person(14);
		
		System.out.println(strPerson);
		System.out.println(intPerson);
		System.out.println(doublePerson);
	}

}

class Person<T>{
	T age;

	public Person(T age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "age=" + age + " ageType="+age.getClass();
	}
	
}
