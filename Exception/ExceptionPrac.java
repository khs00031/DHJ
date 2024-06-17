
public class ExceptionPrac {

	public static void main(String[] args) {
		int N = 3;
		Student[] list = new Student[N];
		list[0] = new Student("홍길동", 15);
		list[1] = new Student("임꺽정", 25);
		list[2] = new Student("강호동", 35);

		for (int i = 0; i < N; i++)
			list[i].printHowOld();
	}

}

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 나이가 30세 이상이면 예외를 발생시킨다.
	// 예외 메시지 : "나이가 너무 많습니다."
	void printHowOld() {

		System.out.println(this.name + "은 " + age + "살 학생입니다.");
	}

}