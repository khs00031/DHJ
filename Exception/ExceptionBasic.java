
public class ExceptionBasic {

	public static void main(String[] args) {
		int N = 3;
		Person[] persons = new Person[N];
		persons[0] = new Person("aaa", 10000, 20);
		persons[1] = new Person("bbb", 20000, 33);
		persons[2] = new Person("ccc", 5000, 0);

		try {
			persons[0].giveMoney(persons[1], 3000);
			for (int i = 0; i < N; i++)
				System.out.println(persons[i]);
		} catch (Exception e) {
			System.out.println("송금 실패!");
			System.out.println("실패 이유 : " + e.getMessage());
		}
	}

}

class Person {
	String name;
	int money, age;

	public Person(String name, int money, int age) {
		super();
		this.name = name;
		this.money = money;
		this.age = age;
	}

	// o에게 send 만큼 돈을 준다.
	void giveMoney(Person o, int send) throws Exception {
		if (this.money < send)
			throw new Exception("돈이 부족합니다.");
		this.money -= send;
		o.money += send;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", money=" + money;
	}

}
