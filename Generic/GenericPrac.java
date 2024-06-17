public class GenericPrac {

	public static void main(String[] args) {
		Person<String> person = new Person<>("10살");
		System.out.println(person);
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
