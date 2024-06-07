public class Truck extends Car {

    private static final int UNIT = 1000;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public int calcFee() {
        return getHour() * UNIT * weight;
    }

    public String getType(){
        return "Truck: ";
    }
    public Truck(String no, int w){
        super(no);
        weight=w;
    }

    public String toString() { return "Truck: " + calcFee(); }

}
