package BastiBAufgaben.Geometry;

import lombok.Builder;

@Builder

public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    double radius;
    double diameter;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    double area;

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    double circumference;

    public void calculateArea() {
        setArea(Math.PI * Math.pow(radius, 2));
    }

    public void calculateDiameter() {
        setDiameter(radius * 2);
    }

    public void calculateCircumference() {
        setCircumference(2 * Math.PI * radius);
    }
}
