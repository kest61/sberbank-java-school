package ru.sberbank.homework.lesson1.shapes.quadrangles;

import ru.sberbank.homework.lesson1.shapes.Rectangular;

/**
 * Quadrangle with right angles
 */
public class Rectangle extends Quadrangle implements Rectangular{
	private float width;
	private float height;

	public Rectangle(float width, float height){
		super(width, height, width, height);
		this.height = height;
		this.width = width;
	}

	@Override
	public double width(){
		return width;
	}

	@Override
	public double height(){
		return height;
	}

	@Override
	public double square(){
		return rectSquare();
	}
}
