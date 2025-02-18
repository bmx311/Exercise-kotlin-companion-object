class TemperatureConverter {
    companion object {
        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }

        fun celsiusToFahrenheit(celsius: Double): Double {
            return celsius * 9 / 5 + 32
        }

        fun kelvinToCelsius(kelvin: Double): Double {
            return kelvin - 273
        }

        fun kelvinToFahrenheit(kelvin: Double): Double {
            return (kelvin-273) * 9 / 5 + 32
        }

        fun fahrenheitToKelvin(fahrenheit: Double): Double {
            return fahrenheitToCelsius(fahrenheit) + 273
        }

        fun celsiusToKelvin(celsius: Double): Double {
            return celsius + 273
        }
    }
}