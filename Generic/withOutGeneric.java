package Generic;

public class withOutGeneric {

	public static void main(String[] args) {
		StringPerson strPerson = new StringPerson("30세");
		IntPerson intPerson = new IntPerson(20);
		DoublePerson doublePerson = new DoublePerson(14);
		
		System.out.println(strPerson);
		System.out.println(intPerson);
		System.out.println(doublePerson);
		
	}

}

class StringPerson {
	String age;

	public StringPerson(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "age=" + age + " ageType=" + age.getClass();
	}

}

class IntPerson {
	Integer age;

	public IntPerson(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "age=" + age + " ageType=" + age.getClass();
	}
}

class DoublePerson {
	Double age;

	public DoublePerson(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "age=" + age + " ageType=" + age.getClass();
	}

}
