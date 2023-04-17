package Construtores e Estáticos;

public class ex04 {
    public class ConversaoDeUnidadesDeTemperatura {

        public static double celsiusParaFahrenheit(double celsius) {
            return (9 * celsius / 5) + 32;
        }
    
        public static double fahrenheitParaCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    
        public static double celsiusParaKelvin(double celsius) {
            return celsius + 273.15;
        }
    
        public static double kelvinParaCelsius(double kelvin) {
            return kelvin - 273.15;
        }
    
        public static double celsiusParaReaumur(double celsius) {
            return celsius * 4 / 5;
        }
    
        public static double reaumurParaCelsius(double reaumur) {
            return reaumur * 5 / 4;
        }
    
        public static double kelvinParaRankine(double kelvin) {
            return kelvin * 1.8;
        }
    
        public static double rankineParaKelvin(double rankine) {
            return rankine / 1.8;
        }
    }
    
}
