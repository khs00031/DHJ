
// students를 Comparable을 이용해 아래 기준에 맞게 정렬하고 출력하시오.
// 정렬기준 : 출석번호, 성적, 이름
// 출력은 학생 N명이 출력되어야함.
public class BTest {

	public static void main(String[] args) {
		int N = 5;
		Student[] students = new Student[N];
		students[0] = new Student("aaa", 13, 80);
		students[1] = new Student("bbb", 2, 100);
		students[2] = new Student("ccc", 25, 54);
		students[3] = new Student("ddd", 16, 98);
		students[4] = new Student("eee", 9, 67);
	}

}

class Student {
	String name;
	int number, score;	// 출석번호, 성적

	public Student(String name, int number, int score) {
		super();
		this.name = name;
		this.number = number;
		this.score = score;
	}

	@Override
	public String toString() {
		return "name=" + name + ", number=" + number + ", score=" + score;
	}

}
