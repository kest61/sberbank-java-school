package ru.sberbank.homework.lesson1.shapes.utils;

public class TestUtil{
	private static final byte DEFAULT_ACCURACY = 5;

	public static double round(double value) {
		return round(value, DEFAULT_ACCURACY);
	}

	public static double round(double value, int accuracy){
		double scale = Math.pow(10, accuracy);
		return Math.round(value * scale) / scale;
	}

}
