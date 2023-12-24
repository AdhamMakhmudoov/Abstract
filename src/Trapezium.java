public class Trapezium extends GeometricFigure{

    private int sideA;

    private int sideB;

    private int high;

    public int getSideA() {return sideA;}

    public void setSideA(int sideA) {this.sideA = sideA;}

    public int getSideB() {return sideB;}

    public void setSideB(int sideB) {this.sideB = sideB;}

    public int getHigh() {return high;}

    public void setHigh(int high) {this.high = high;}

    @Override
    public void area() {
        System.out.println("Trapezium area");
    }

    @Override
    public void peremetr() {
        System.out.println("Trapezium peremtr");
    }
}
