package ru.sberbank.homework.lesson1.shapes;

/**
 * An abstract shape class that implements geometric shape methods
 */
public abstract class Figure implements GeometricFigure{

	/**
	 * The number of edges
	 */
	private byte edges;

	public Figure(Shape shape){
		this.edges = shape.getEdges();
	}

	public byte edges(){
		return edges;
	}

}
