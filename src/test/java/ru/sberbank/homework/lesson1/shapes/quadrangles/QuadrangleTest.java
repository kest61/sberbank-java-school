package ru.sberbank.homework.lesson1.shapes.quadrangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadrangleTest{
	public static final int EDGES = 4;
	protected static float width;
	protected static float height;
	protected static float side;
	protected static float rectPerimeter;
	protected static float squarePerimeter;

	private static Quadrangle rectangle;
	private static Quadrangle square;

	@BeforeAll
	static void setUp(){
		width = 12.8f;
		height = 14.08f;
		side = 7.34f;
		rectPerimeter = 2*(width + height);
		squarePerimeter = EDGES*side;
		rectangle = new Rectangle(width, height);
		square = new Square(side);
	}

	@Test
	void testRectPerimeter(){
		assertEquals(rectPerimeter, rectangle.perimeter());
	}

	@Test
	void testSquarePerimeter(){
		assertEquals(squarePerimeter, square.perimeter());
	}
}