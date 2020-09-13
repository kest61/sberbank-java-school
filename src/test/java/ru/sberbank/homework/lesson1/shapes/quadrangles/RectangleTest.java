package ru.sberbank.homework.lesson1.shapes.quadrangles;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.sberbank.homework.lesson1.shapes.utils.TestUtil.round;

class RectangleTest extends QuadrangleTest{
	private static Rectangle rectangle;
	private static double square;

	@BeforeAll
	static void setRect(){
		square = width*height;
		rectangle = new Rectangle(width, height);
	}

	@Test
	void testWidth(){
		assertEquals(width, rectangle.width());
	}

	@Test
	void testHeight(){
		assertEquals(height, rectangle.height());
	}

	@Test
	void testRectPerimeter(){
		assertEquals(rectPerimeter, rectangle.perimeter());
	}

	@Test
	void testRectSquare(){
		assertEquals(round(square), round(rectangle.square()));
	}


}