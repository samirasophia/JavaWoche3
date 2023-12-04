package BastiBAufgaben.Geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    @Test
    void calculateArea() {
        //GIVEN

        Circle circle = Circle.builder()
                .radius(4)
                .area(0)
                .build();
        //WHEN
        circle.calculateArea();
        double actual = circle.getArea();
//THEN
        assertEquals(50.26548245743669, actual);
    }

}