package ru.sberbank.homework.lesson1.shapes.triangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;
import ru.sberbank.homework.lesson1.shapes.triangle.Triangle;

import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

import static org.junit.jupiter.api.Assertions.*;

strictfp class TriangleTest {
    private static float sideA;
    private static float sideB;
    private static float sideC;

    protected static Triangle triangle;
    protected static double square;
    protected static float perimeter;

    @BeforeAll
    static void setUp() {
        sideA = 2.56f;
        sideB = 4.08f;
        sideC = 3.15f;
        perimeter = sideA + sideB + sideC;
        double oppositeC = Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - (Math.pow(sideC, 2))) / (2 * sideA * sideB));
        square = sideA * sideB * Math.sin(oppositeC) / 2;
        triangle = new Triangle(sideA, sideB, sideC);
    }

    @Test
    void testPerimeter() {
        assertEquals(perimeter, triangle.perimeter());
    }

    @Test
    void testSquare() {
        assertEquals(round(square), round(triangle.square()));
    }

    @Test
    void testInscribed() {
        double radius = 2 * square / perimeter;
        //TODO Override equals() method of Сircle class
        assertEquals(round(new Circle(radius).square()), round(triangle.inscribed().square()));
    }

}