package ru.sberbank.homework.lesson1.shapes.triangle;

import ru.sberbank.homework.lesson1.shapes.Circumscribed;
import ru.sberbank.homework.lesson1.shapes.Figure;
import ru.sberbank.homework.lesson1.shapes.Shape;
import ru.sberbank.homework.lesson1.shapes.circle.Circle;

/**
 * Simple triangle with three sides
 */
public class Triangle extends Figure implements Circumscribed{
	private float edgeA;
	private float edgeB;
	private float edgeC;

	public Triangle(float edgeA, float edgeB, float edgeC){
		super(Shape.TRIANGLE);
		this.edgeA = edgeA;
		this.edgeB = edgeB;
		this.edgeC = edgeC;
	}

	@Override
	public double square(){
		double halfP = perimeter()/2;
		return Math.sqrt(halfP*(halfP - edgeA)*(halfP - edgeB)*(halfP - edgeC));
	}

	@Override
	public double perimeter(){
		return edgeA + edgeB + edgeC;
	}

	@Override
	public Circle inscribed(){
		double halfP = perimeter()/2;
		double radius = Math.sqrt((halfP - edgeA)*(halfP - edgeB)*(halfP - edgeC)/halfP);
		return new Circle(radius);
	}
}
