package ru.sberbank.homework.lesson1.shapes.quadrangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;

import static org.junit.jupiter.api.Assertions.*;
import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

class SquareTest extends RectangleTest{
	private static Square rectangle;
	private static double square;

	@BeforeAll
	static void setRect(){
		square = side*side;
		rectangle = new Square(side);
	}

	@Test
	void testSide(){
		assertEquals(side, rectangle.side());
	}

	@Test
	void testEquilterEdges(){
		assertEquals(EDGES, rectangle.edges());
	}

	@Test
	void testEquilterPerimeter(){
		assertEquals(squarePerimeter, rectangle.equilateralPerimeter());
	}

	@Test
	void testEquilaterSquare(){
		assertEquals(round(square), round(rectangle.equilateralSquare()));
	}

	@Test
	void testInscribed(){
		double radius = side/2;
		//TODO Override equals() method of Сircle class
		assertEquals(round(new Circle(radius).square()), round(rectangle.inscribed().square()));
	}

}