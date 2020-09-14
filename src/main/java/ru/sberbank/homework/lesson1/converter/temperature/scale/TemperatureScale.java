package ru.sberbank.homework.lesson1.converter.temperature.scale;

/**
 * Temperature scale interface
 */
public interface TemperatureScale{

	/**
	 * @param degreesCelsius Celsius temperature value
	 * @return temperature value on its own scale
	 */
	double parse(double degreesCelsius);
}
