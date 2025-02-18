fun main() {
    val tempF = 789.242
    val tempC = 20.789
    val tempK = 0.0 //absolute zero

    println("$tempF°F Converted to Celsius: ${TemperatureConverter.fahrenheitToCelsius(tempF)}°C. " +
            "converted to Kelvin: ${TemperatureConverter.fahrenheitToKelvin(tempF)}°K")

    println("$tempC°C Converted to Fahrenheit: ${TemperatureConverter.celsiusToFahrenheit(tempC)}°F. " +
            "converted to Kelvin: ${TemperatureConverter.celsiusToKelvin(tempC)}°K")
    
    println("$tempK°K converted to Celsius:  ${TemperatureConverter.kelvinToCelsius(tempK)}°C " +
            "converted to Fahrenheit: ${TemperatureConverter.kelvinToFahrenheit(tempK)}°F")
}

//thinking of implementing FahrenheitToCelsius(celsiusToKelvin(tempF))