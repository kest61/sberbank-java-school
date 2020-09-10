package ru.sberbank.homework.lesson1.shapes.circle;

import ru.sberbank.homework.lesson1.shapes.Figure;
import ru.sberbank.homework.lesson1.shapes.Shape;

/**
 * Class for circle
 */
public class Circle extends Figure{


	/**
	 * Radius of circle
	 */
	private double radius;

	public Circle(double radius){
		super(Shape.CIRCLE);
		this.radius = radius;
	}

	@Override
	public double square(){
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
}
