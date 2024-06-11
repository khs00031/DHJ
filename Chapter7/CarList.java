//- addCar(Car c) : carList에 c를 추가한다.
//- findCar(Car c) : carList에서 c.no와 동일한 Car 객체를 반환한다. 없다면 null을 반환함
//- caclTotalFee() : carList의 모든 Car 객체의 fee의 합계를 반환한다.
public class CarList {
    private Car[] carList;
    private int current = 0; // 배열의 인덱스로 사용한다.

    public CarList(int n) {
        carList = new Car[n];
    }

    public Car getCar(int i) {
        return carList[i];
    }

    public void addCar(Car c) {
        carList[current++] = c;
    }

    public Car findCar(String no) {
        for(Car car:carList){ // carList에서 car을 하나씩 꺼낸다.
            if(car!=null && car.getNo().equals(no)) return car; // 번호가 같으면 car 객체를 return하고 배열에 있는 모든 차량의 비교가 끝났는데도 같은 번호의 차량이 없다면 null을 반환한다.
        } return null;
    }

    public int calcTotalFee() {
        int totalFee=0; // totalFee를 0으로 설정한다.
        for (Car car:carList) {
            if(car!=null){
                totalFee += car.calcFee();
            }
        }
        return totalFee;
    }
}
