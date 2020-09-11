package ru.sberbank.homework.lesson1.shapes.quadrangles;

import ru.sberbank.homework.lesson1.shapes.Equilateral;
import ru.sberbank.homework.lesson1.shapes.Rectangular;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;

/**
 * Quadrangle with right angles and equal sides
 */
public class Square extends Quadrangle implements Rectangular, Equilateral{
	private float side;

	public Square(float side){
		super(side, side, side, side);
		this.side = side;
	}

	@Override
	public Circle inscribed(){
		return new Circle(side/2);
	}

	@Override
	public double width(){
		return side;
	}

	@Override
	public double height(){
		return width();
	}

	@Override
	public double equilateralSquare(){
		return Math.pow(side, 2);
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
	public double square(){
		return rectSquare();
	}
}
