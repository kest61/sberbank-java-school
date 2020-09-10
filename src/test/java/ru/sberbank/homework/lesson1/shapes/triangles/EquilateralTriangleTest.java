package ru.sberbank.homework.lesson1.shapes.triangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.triangle.EquilateralTriangle;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class EquilateralTriangleTest extends TriangleTest{
	private static float side;
	private static final byte SIDE_COUNT = 3;

	protected static EquilateralTriangle equilateralTriangle;

	@BeforeAll
	static void setUp(){
		side = 7.83f;
		perimeter = SIDE_COUNT*side;
		double oppositWidth = Math.acos((Math.pow(side, 2) + Math.pow(side, 2) - (Math.pow(side, 2)))/(2*side*side));
		square = side*side*Math.sin(oppositWidth)/2;
		equilateralTriangle = new EquilateralTriangle(side);
		triangle = equilateralTriangle;
	}

	@Test
	void testEdges(){
		assertEquals(SIDE_COUNT, equilateralTriangle.edges());
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