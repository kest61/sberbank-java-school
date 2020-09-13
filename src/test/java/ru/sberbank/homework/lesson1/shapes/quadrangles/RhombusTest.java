package ru.sberbank.homework.lesson1.shapes.quadrangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

class RhombusTest extends QuadrangleTest{
	private static Rhombus rhombus;
	private static double square;

	@BeforeAll
	static void setRect(){
		square = side*height;
		rhombus = new Rhombus(side, height);
	}

	@Test
	void testSide(){
		assertEquals(side, rhombus.side());
	}

	@Test
	void testRhombusEdges(){
		assertEquals(EDGES, rhombus.edges());
	}

	@Test
	void testRhombusPerimeter(){
		assertEquals(squarePerimeter, rhombus.equilateralPerimeter());
	}

	@Test
	void testRhombusSquare(){
		assertEquals(round(square), round(rhombus.equilateralSquare()));
	}

	@Test
	void testInscribed(){
		double radius = height/2;
		//TODO Override equals() method of Сircle class
		assertEquals(round(new Circle(radius).square()), round(rhombus.inscribed().square()));
	}

}