package ru.sberbank.homework.lesson1.shapes;

import ru.sberbank.homework.lesson1.shapes.circle.Circle;

/**
 * Interface for shapes that can fit a circle
 */
public interface Circumscribed{

	/**
	 * @return inscribed circle
	 */
	Circle inscribed();
}
