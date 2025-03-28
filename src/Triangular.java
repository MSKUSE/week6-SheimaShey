public class Triangular extends Shape {
    private int sideA,sideB,sideC;

    public Triangular(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return sideA*sideB/2.0;
    }

    @Override
    public double perimeter() {
        return sideB+sideA+sideC;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}