
public class WithOutException {
	public static void main(String[] args) {
		int N = 3;
		Person[] persons = new Person[N];
		persons[0] = new Person("aaa", 10000, 20);
		persons[1] = new Person("bbb", 20000, 33);
		persons[2] = new Person("ccc", 5000, 0);

		persons[0].agePercent(persons[2]);
		persons[0].giveMoney(persons[1], 3000);
		for (int i = 0; i < N; i++)
			System.out.println(persons[i]);

		System.out.println("모든 연산 완료");
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

	// this가 o의 비해 몇% 나이를 먹었는지 출력
	void agePercent(Person o) {
		if (o.age == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		double percent = this.age / o.age;
		System.out.println(this.name + "의 나이는 " + o.name + "의 " + percent + "입니다.");
	}

	// o에게 send 만큼 돈을 준다.
	boolean giveMoney(Person o, int send) {
		if (this.money < send)
			return false;
		this.money -= send;
		o.money += send;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", money=" + money;
	}

}