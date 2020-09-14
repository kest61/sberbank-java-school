package ru.sberbank.homework.lesson1.converter.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest{
	double temperatureC = 30;
	double temperatureF = 86;
	double temperatureK = 303.15;

	@Test
	void testParseFahrenheit(){
		assertEquals(temperatureF, new FahrenheitConverter().parse(temperatureC));
	}

	@Test
	void testParseKelvin(){
		assertEquals(temperatureK, new KelvinConverter().parse(temperatureC));
	}
}