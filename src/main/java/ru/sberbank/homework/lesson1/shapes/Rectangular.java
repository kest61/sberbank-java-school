package ru.sberbank.homework.lesson1.shapes;


/**
 * Interface for right angle shapes with height and width
 */
public interface Rectangular{

	/**
	 * @return the width of shape
	 */
	double width();

	/**
	 * @return the height of shape
	 */
	double height();

	/**
	 * @return perimeter calculated based on width and height
	 */
	default double rectPerimeter(){
		return 2 * (width() + height());
	}

	/**
	 * @return square calculated based on width and height
	 */
	default double rectSquare(){
		return width() * height();
	}
}
