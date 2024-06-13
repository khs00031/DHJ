// students를 Lambda식을 이용해 아래 기준에 맞게 정렬하고 출력하시오.
// TTest와 동일
// 정렬기준1 : 출석번호, 성적
// 정렬기준2 : 이름
// 출력은 정렬기준 2에 따라 정렬기준1 N줄, 정렬기준2 N줄
// 총 2N줄이 출력되야함.
import java.util.Arrays;
import java.util.Comparator;

public class LTest {

    public static void main(String[] args) {
        int N = 5;
        Student[] students = new Student[N];
        students[0] = new Student("aaa", 13, 80);
        students[1] = new Student("bbb", 2, 100);
        students[2] = new Student("ccc", 25, 54);
        students[3] = new Student("ddd", 16, 98);
        students[4] = new Student("eee", 9, 67);

        // 출석번호와 성적에 따라 정렬
        System.out.println("출석번호와 성적에 따라 정렬합니다.");
        Arrays.sort(students,  (o1, o2) -> { if (o1.number != o2.number) return Integer.compare(o1.number, o2.number);
        else return Integer.compare(o1.score, o2.score);
        });
        for (int i = 0; i < N; i++) System.out.println(students[i]);

        System.out.println();

        // 이름에 따라 정렬
        System.out.println("이름에 따라 정렬합니다.");
        Arrays.sort(students, (o1, o2) -> { return o1.name.compareTo(o2.name);});
        for (int i = 0; i < N; i++) System.out.println(students[i]);
    }
    
}

class Student {
    String name;
    int number, score; // 출석번호, 성적

    public Student(String name, int number, int score) {
        this.name = name;
        this.number = number;
        this.score = score;
    }

    @Override
    public String toString() {
        return "name=" + name + ", number=" + number + ", score=" + score;
    }
}