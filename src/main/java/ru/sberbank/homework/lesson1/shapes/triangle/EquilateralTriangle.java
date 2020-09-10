package ru.sberbank.homework.lesson1.shapes.triangle;

import ru.sberbank.homework.lesson1.shapes.Equilateral;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;

/**
 * Equilateral triangle
 */
public class EquilateralTriangle extends Triangle implements Equilateral{
	private float side;

	public EquilateralTriangle(float side){
		super(side, side, side);
		this.side = side;
	}

	@Override
	public byte edges(){
		return super.edges();
	}

	@Override
	public float side(){
		return side;
	}

	@Override
	public double equilateralSquare(){
		return (Math.sqrt(3)*Math.pow(side, 2))/4;
	}

	@Override
	public Circle inscribed(){
		double radius = side*Math.sqrt(3)/6;
		return new Circle(radius);
	}
}
