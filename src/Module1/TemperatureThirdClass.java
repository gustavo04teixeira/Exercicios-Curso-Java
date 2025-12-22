package Module1;

public class TemperatureThirdClass {
    static void main(String[] args) {
        //aqui estou fazendo uma conta para converter °F em °C.
        final int less = 32;
        final  double Divisão = 5/9.0;
        //final é quando uma variável nunca será alterada, sempre vai ter o mesmo valor.
        int Fire = 89;
        double Celsius = (Fire - less) * Divisão;

        System.out.println("A temperatura é " + Celsius + "°C");

        Fire = 200;
        Celsius = (Fire - less) * Divisão;
        System.out.println("A segunda temperatura é " + Celsius + "°C");
    }
}
