public class quadrilateral {
    double side1, side2, side3, side4;
    static int numofobjects = 0;
    int idNum;
    quadrilateral(){
        side1 = side2 = side3 = side4 = 1.0;
        numofobjects++;
        idNum = numofobjects;
    }
    quadrilateral(double s1, double s2, double s3, double s4){
        numofobjects++;
        idNum = numofobjects;
        side1 = s1;
        side2 = s2;
        side3 = s3;
        side4 = s4;
    }  
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setSide4(double side4) {
        this.side4 = side4;
    }public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getSide4() {
        return side4;
    }
    public double getPerimeter() {
        return side1+side2+side3+side4;
    } 
    @Override
    public String toString() {
        return String.format("Quadrilateral No. %d\nSide 1: %.2f\nSide 2: %.2f\nSide 3: %.2f\nSide 4: %.2f\nPerimeter: %.2f", idNum, side1, side2, side3, side4, getPerimeter());
    }
}
