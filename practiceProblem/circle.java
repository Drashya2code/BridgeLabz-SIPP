package practiceProblem;

class Area{
    double radius;
    double area;

    Area(double radius){
        this.radius = radius;
        this.area = calculateArea();
    }

    // method to cal. Area
    private double calculateArea(){
        double calArea = 3.14*radius*radius;
        return calArea;
    }

    void displayArea(){
        System.err.println("Area "+ area);
    }
}

public class circle {
    public static void main(String[] args) {
      Area area = new Area(2);
      area.displayArea();
    }
}
