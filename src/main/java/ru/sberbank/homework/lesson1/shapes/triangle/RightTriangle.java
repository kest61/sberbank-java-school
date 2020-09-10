package ru.sberbank.homework.lesson1.shapes.triangle;

import ru.sberbank.homework.lesson1.shapes.Rectangular;

/**
 * Right-angled triangle with height and width
 */
public class RightTriangle extends Triangle implements Rectangular{
	private float width;
	private float height;

	public RightTriangle(float width, float height){
		super(width, height, hypotenuse(width, height));
		this.height = height;
		this.width = width;
	}

	/**
	 * @param width  the first leg
	 * @param height the second leg
	 * @return hypotenuse
	 */
	private static float hypotenuse(float width, float height){
		return (float) Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
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
	public double rectPerimeter(){
		return width + height + hypotenuse(width, height);
	}

	@Override
	public double rectSquare(){
		return width * height / 2;
	}
}
