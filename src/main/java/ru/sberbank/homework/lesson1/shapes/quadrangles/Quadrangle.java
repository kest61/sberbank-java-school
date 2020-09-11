package ru.sberbank.homework.lesson1.shapes.quadrangles;

import ru.sberbank.homework.lesson1.shapes.Figure;
import ru.sberbank.homework.lesson1.shapes.Shape;

/**
 * Abstract quadrangle
 */
public abstract class Quadrangle extends Figure{
	private float edgeA;
	private float edgeB;
	private float edgeC;
	private float edgeD;

	public Quadrangle(float edgeA, float edgeB, float edgeC, float edgeD){
		super(Shape.QUADRANGLE);
		this.edgeA = edgeA;
		this.edgeB = edgeB;
		this.edgeC = edgeC;
		this.edgeD = edgeD;
	}

	/**
	 * @return perimeter of a quadrangle.
	 * The method is abstract, since the calculation
	 * of the square of a simple quadrangle is nontrivial.
	 */
	@Override
	public abstract double square();

	/**
	 * @return perimeter of a simple quadrangle
	 */
	@Override
	public double perimeter(){
		return edgeA + edgeB + edgeC + edgeD;
	}

}
