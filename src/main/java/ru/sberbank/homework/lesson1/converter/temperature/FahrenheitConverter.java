package ru.sberbank.homework.lesson1.converter.temperature;

import ru.sberbank.homework.lesson1.converter.temperature.scale.FahrenheitScale;
import ru.sberbank.homework.lesson1.converter.temperature.scale.TemperatureScale;

/**
 * Temperature Fahrenheit converter
 */
public class FahrenheitConverter extends TemperatureConverter{
	@Override
	public TemperatureScale getConverter(){
		return new FahrenheitScale();
	}
}
