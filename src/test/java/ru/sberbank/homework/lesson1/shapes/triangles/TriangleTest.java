package ru.sberbank.homework.lesson1.shapes.triangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.FigureTest;
import ru.sberbank.homework.lesson1.shapes.Shape;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;
import ru.sberbank.homework.lesson1.shapes.triangle.Triangle;

import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends FigureTest{
	public static final int EDGES = Shape.TRIANGLE.getEdges();

	protected static Triangle triangle;
	protected static double square;
	protected static float perimeter;

	@BeforeAll
	static void setUp(){
		float[] edges = {2.56f, 4.08f, 3.15f};
		triangle = new Triangle(edges[0], edges[1], edges[2]);
		setTestData(edges);
	}

	protected static void setTestData(float[] edges){
		perimeter = edges[0] + edges[1] + edges[2];
		double oppositeEdgeOne = Math.acos((Math.pow(edges[2], 2) + Math.pow(edges[0], 2) - (Math.pow(edges[1], 2)))/(2*edges[2]*edges[0]));
		square = edges[2]*edges[0]*Math.sin(oppositeEdgeOne)/2;
	}

	@Test
	void testPerimeter(){
		assertEquals(perimeter, triangle.perimeter());
	}

	@Test
	void testSquare(){
		assertEquals(round(square), round(triangle.square()));
	}

	@Test
	void testInscribed(){
		double radius = 2*square/perimeter;
		//TODO Override equals() method of Сircle class
		assertEquals(round(new Circle(radius).square()), round(triangle.inscribed().square()));
	}

	@Test
	protected void testEdges(){
		assertEquals(EDGES, triangle.edges());
	}
}