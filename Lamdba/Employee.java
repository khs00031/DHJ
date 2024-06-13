import java.time.LocalDate;
import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public int compareTo(Employee other) {  // Compare employees by salary
        return Double.compare(salary, other.salary);
    }

    static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };
}

//실습지 내용
//import java.util.Comparator;
//
//public class NameComparator implements Comparator<Employee>{
//    public int compare(Employee employee1, Employee employee2) {
//
//        String personName1 = employee1.getName();
//
//        String personName2 = employee2.getName();
//
//       return personName1.compareToIgnoreCase(personName2); // String method - ignore case
//    }
//}