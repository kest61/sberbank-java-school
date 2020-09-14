package ru.sberbank.homework.lesson1.converter.temperature;

import ru.sberbank.homework.lesson1.converter.temperature.scale.KelvinScale;
import ru.sberbank.homework.lesson1.converter.temperature.scale.TemperatureScale;

/**
 * Kelvin Temperature converter
 */
public class KelvinConverter extends TemperatureConverter{
	@Override
	public TemperatureScale getConverter(){
		return new KelvinScale();
	}
}
