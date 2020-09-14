package ru.sberbank.homework.lesson1.converter.temperature.scale;

/**
 * Temperature Kelvin scale
 */
public class KelvinScale implements TemperatureScale{
	public static final double TRIPLE_POINT_WATER_TEMPERATURE = 273.15;
	@Override
	public double parse(double degreesCelsius){
		return degreesCelsius + TRIPLE_POINT_WATER_TEMPERATURE;
	}
}
