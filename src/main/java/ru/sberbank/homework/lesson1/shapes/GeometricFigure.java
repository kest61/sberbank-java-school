package ru.sberbank.homework.lesson1.shapes;

/**
 * Interface defining basic methods of geometric shapes
 */
public interface GeometricFigure{

	/**
	 * @return the figure area
	 */
	double square();

	/**
	 * @return figure perimeter (circumference for a circle)
	 */
	double perimeter();
}
