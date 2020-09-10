package ru.sberbank.homework.lesson1.shapes;

/**
 * Interface for shapes with all edges equal
 */
public interface Equilateral extends Circumscribed{

	/**
	 * @return number of edges
	 */
	byte edges();

	/**
	 * @return size of edge
	 */
	float side();

	/**
	 * @return perimeter is calculated based on side
	 */
	default double equilateralPerimeter(){
		return edges()*side();
	}

	/**
	 * @return square is calculated based on side
	 */
	double equilateralSquare();
}
