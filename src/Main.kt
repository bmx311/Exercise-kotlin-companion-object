import TemperatureConverter.Companion.celsiusToFahrenheit
import TemperatureConverter.Companion.celsiusToKelvin
import TemperatureConverter.Companion.fahrenheitToCelsius
import TemperatureConverter.Companion.kelvinToCelsius

fun main() {
    val tempF = 789.242
    val tempC = 20.789
    val tempK = 0.0 //absolute zero

    println("$tempF°F Converted to Celsius: ${fahrenheitToCelsius(tempF)}°C. " +
            "converted to Kelvin: ${celsiusToKelvin(fahrenheitToCelsius(tempF))}°K")

    println("$tempC°C Converted to Fahrenheit: ${celsiusToFahrenheit(tempC)}°F. " +
            "converted to Kelvin: ${celsiusToKelvin(tempC)}°K")
    
    println("$tempK°K converted to Celsius:  ${kelvinToCelsius(tempK)}°C " +
            "converted to Fahrenheit: ${celsiusToFahrenheit(kelvinToCelsius(tempK))}°F")
}

//if a road connects point A to B. And a road from B to C.
// Is there really a need to create a road from A to C?
// points is: converting from Kelvin to Fahrenheit..
// is the same as converting from Kelvin to Celsius then Converting Celsius to Fahrenheit
//Thank you for coming to my ted talk!