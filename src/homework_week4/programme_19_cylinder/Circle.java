package homework_week4.programme_19_cylinder;

public class Circle {
    private double radius;

    // 1st constructor, which sets both radius and color to default
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // 2nd constructor with given radius, but color default
    public Circle(double radius) {
        super();
        this.radius = radius;
    }


    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }


    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }




}
