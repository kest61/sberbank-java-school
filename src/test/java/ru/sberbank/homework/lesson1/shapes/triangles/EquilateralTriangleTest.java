package ru.sberbank.homework.lesson1.shapes.triangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.triangle.EquilateralTriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

class EquilateralTriangleTest extends TriangleTest{
	private static float side;

	protected static EquilateralTriangle equilateralTriangle;

	@BeforeAll
	static void setUp(){
		side = 7.83f;
		equilateralTriangle = new EquilateralTriangle(side);
		triangle = equilateralTriangle;

		setTestData(new float[]{side, side, side});
	}

	@Test
	void testEquilateralEdges(){
		assertEquals(EDGES, equilateralTriangle.edges());
	}

	@Test
	void testSide(){
		assertEquals(side, equilateralTriangle.side());
	}

	@Test
	void testEquilateralPerimeter(){
		assertEquals(perimeter, equilateralTriangle.equilateralPerimeter());
	}

	@Test
	void testEquilateralSquare(){
		assertEquals(round(square), round(equilateralTriangle.equilateralSquare()));
	}

}