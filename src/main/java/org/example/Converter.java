package org.example;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Проект Converter запущено.");

        TemperatureConverter tempConverter = new TemperatureConverter();

        // Приклад конвертації
        double fahrenheit = 100;
        double celsius = tempConverter.fahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);

        double celsiusInput = 37.78;
        double fahrenheitOutput = tempConverter.celsiusToFahrenheit(celsiusInput);
        System.out.printf("%.2f°C = %.2f°F%n", celsiusInput, fahrenheitOutput);
    }
}