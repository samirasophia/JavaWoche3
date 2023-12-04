package BastiBAufgaben.Geometry;


public class usage {
    public static void main(String[] args) {
        //CIRCLE

        Circle circle1 = new Circle.CircleBuilder()
                .radius(4)
                .build();
        circle1.calculateArea();
        System.out.println(circle1.getArea());
        circle1.calculateCircumference();
        System.out.println(circle1.circumference);
        circle1.calculateDiameter();
        System.out.println(circle1.diameter);
    }
}

