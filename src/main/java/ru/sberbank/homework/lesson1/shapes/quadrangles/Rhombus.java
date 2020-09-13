package ru.sberbank.homework.lesson1.shapes.quadrangles;

import ru.sberbank.homework.lesson1.shapes.Equilateral;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;

public class Rhombus extends Quadrangle implements Equilateral{
	private float side;
	private float height;

	public Rhombus(float side, float height){
		super(side, side, side, side);
		this.side = side;
		this.height = height;
	}

	@Override
	public double square(){
		return equilateralSquare();
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
		return side*height;
	}

	@Override
	public Circle inscribed(){
		return new Circle(height/2);
	}
}
