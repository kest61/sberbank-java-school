package ru.sberbank.homework.lesson1.converter.temperature;

import ru.sberbank.homework.lesson1.converter.temperature.scale.TemperatureScale;

/**
 * Temperature converter base class
 */
public abstract class TemperatureConverter{

	/**
	 * @param degreesCelsius Celsius temperature value
	 * @return converted value
	 */
	public double parse(double degreesCelsius){
		TemperatureScale converter = getConverter();
		return converter.parse(degreesCelsius);
	}

	/**
	 * @return the specific class of temperature scale
	 */
	public abstract TemperatureScale getConverter();
}
