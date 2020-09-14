package ru.sberbank.homework.lesson1.converter.temperature.scale;

/**
 * Temperature Fahrenheit scale
 */
public class FahrenheitScale implements TemperatureScale{
	public static double ICE_MELTING_F = 32;
	public static double WATER_BOILING_F = 212;
	public static double ICE_MELTING_C = 0;
	public static double WATER_BOILING_C = 100;
	public static double DEGREES_F_IN_C = (WATER_BOILING_F - ICE_MELTING_F)/(WATER_BOILING_C - ICE_MELTING_C);

	@Override
	public double parse(double degreesCelsius){
		return DEGREES_F_IN_C*degreesCelsius + ICE_MELTING_F;
	}
}
