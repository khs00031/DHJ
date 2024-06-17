// CarTest2.java
public class CarTest2 {
    public static void main(String[] args) {
        Car c = new Car("CA-1111");
        Bus b = new Bus("NC-2222", 2);
        Car c2 = b;
        System.out.println(c.no); // (가): class Car에서 no는 private으로 선언된 변수이기 때문에 외부에서 사용할 수 없다.
        System.out.println(b.getNo() + b.calcFee());    // (나)
        System.out.println(c2.getNo() + c2.getSize()); // (다):
        System.out.println(b.getSize() + c2.calcFee()); // (라)
    }
}