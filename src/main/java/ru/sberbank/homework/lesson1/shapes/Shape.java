package ru.sberbank.homework.lesson1.shapes;

/**
 * A class that describes a shape by specifying the number of edges
 */
public enum Shape{
	CIRCLE((byte) 0),
	POINT((byte) 1),
	EDGE((byte) 2),
	TRIANGLE((byte) 3),
	QUADRANGLE((byte) 4);

	/**
	 * The number of edges
	 */
	private byte edges;

	Shape(byte pointsCount){
		this.edges = pointsCount;
	}

	public byte getEdges(){
		return edges;
	}
}
