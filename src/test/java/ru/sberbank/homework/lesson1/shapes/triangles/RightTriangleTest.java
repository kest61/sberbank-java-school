package ru.sberbank.homework.lesson1.shapes.triangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.sberbank.homework.lesson1.shapes.triangle.RightTriangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

class RightTriangleTest extends TriangleTest{
	private static float width;
	private static float height;

	protected static RightTriangle rightTriangle;

	@BeforeAll
	static void setUp(){
		width = 5.07f;
		height = 7.21f;
		rightTriangle = new RightTriangle(width, height);
		triangle = rightTriangle;

		float hypotenuse = (float) Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		setTestData(new float[]{width, height, hypotenuse});
	}

	@Test
	void testWidth(){
		assertEquals(width, rightTriangle.width());
	}

	@Test
	void testHeight(){
		assertEquals(height, rightTriangle.height());
	}

	@Test
	void testRectPerimeter(){
		assertEquals(perimeter, rightTriangle.rectPerimeter());
	}

	@Test
	void testRectSquare(){
		assertEquals(round(square), round(rightTriangle.rectSquare()));
	}

}