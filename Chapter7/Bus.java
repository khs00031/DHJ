public class Bus extends Car {
    private static final int UNIT = 1000;
    private int size;

    public Bus(String no, int s) {
        super(no);
        size = s;
    }

    public int getSize() {
        return size;
    }

    public int calcFee() {
        return getHour() * UNIT * size;
    }

    public String toString() { return "Bus: " + calcFee(); }

}