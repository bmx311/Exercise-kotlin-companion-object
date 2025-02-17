class TemperatureConverter{
    companion object {
        fun toCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9
        }

        fun toFahrenheit(celsius: Double): Double {
            return celsius * 9/5 + 32
        }
    }
}

fun main() {
    val tempF = 789.242
    val tempC = 20.789

    println("$tempF°F = ${TemperatureConverter.toCelsius(tempF)}°C")
    println("$tempC°C = ${TemperatureConverter.toFahrenheit(tempC)}°F")
}