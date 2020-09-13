package ru.sberbank.homework.lesson1.shapes.quadrangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.FigureTest;
import ru.sberbank.homework.lesson1.shapes.Shape;

import static org.junit.jupiter.api.Assertions.*;
import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

class QuadrangleTest extends FigureTest{
	public static final byte EDGES = Shape.QUADRANGLE.getEdges();

	protected static float width;
	protected static float height;
	protected static float side;
	protected static float rectPerimeter;
	protected static float squarePerimeter;

	private static Quadrangle rectangle;
	private static Quadrangle square;
	private static Quadrangle rhombus;

	@BeforeAll
	static void setUp(){
		width = 12.8f;
		height = 14.08f;
		side = 7.34f;
		rectPerimeter = 2*(width + height);
		squarePerimeter = EDGES*side;
		rectangle = new Rectangle(width, height);
		square = new Square(side);
		rhombus = new Rhombus(side, height);
	}

	@Test
	void testRectPerimeter(){
		assertEquals(rectPerimeter, rectangle.perimeter());
	}

	@Test
	void testSquarePerimeter(){
		assertEquals(squarePerimeter, square.perimeter());
	}

	@Test
	void testRhombusPerimeter(){
		assertEquals(squarePerimeter, rhombus.perimeter());
	}

	@Override
	protected void testEdges(){
		assertEquals(EDGES, rectangle.edges());
	}

	@Test
	void testSquare(){
		Quadrangle rect = new Rectangle(side, side);
		assertEquals(round(square.square()), round(rect.square()));
		Quadrangle rhomb = new Rhombus(side,side);
		assertEquals(round(square.square()), round(rhomb.square()));
	}

}