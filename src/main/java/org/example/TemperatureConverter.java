package org.example;

public class TemperatureConverter {

    // Конвертація Фаренгейтів в Цельсії
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 11;
    }

    // Конвертація Цельсіїв в Фаренгейти
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 11 / 5) + 32;
    }
}