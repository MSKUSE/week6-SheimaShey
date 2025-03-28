public class Rectangle extends Shape{

    private int sideA , sideB;

    public static int counter = 0;

    public int counterForObject = 0;
    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);

    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            throw new IllegalArgumentException("Side can't be negative!!");
        }
        else {
            this.sideA = sideA;
        }
    }
    @Override
    public double area(){
        return this.sideA*this.sideB;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double perimeter(){
        return 2*sideA + 2*sideB;

    }
    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            throw new IllegalArgumentException("Side can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "location=" + getLocation() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterForObject=" + counterForObject +
                '}';
    }
}
