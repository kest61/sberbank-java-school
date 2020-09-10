package ru.sberbank.homework.lesson1.shapes.circle;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest{
	private static float radius;
	private static Circle circle;

	@BeforeAll
	static void setUp(){
		radius = 5;
		circle = new Circle(radius);
	}

	@Test
	void testPerimetr(){
		double perimeter = 2 * Math.PI * radius;
		assertEquals(perimeter, circle.perimeter());
	}

	@Test
	void testSquare(){
		double square = Math.PI * Math.pow(radius, 2);
		assertEquals(square, circle.square());
	}
}