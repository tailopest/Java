public class temperatura {
    public static void main (String[] args) {
        double C = 30;
        double K = C + 273.15, Re = C * 0.8, Ra = C * 1.8 + 32 + 459.67, F = C * 1.8 + 32;
        System.out.println ("Celsius: " + C + " -> Kelvin: " + K);
        System.out.println ("Celsius: " + C + " -> Reaumur: " + Re);
        System.out.println ("Celsius: " + C + " -> Rankine: " + Ra);
        System.out.println ("Celsius: " + C + " -> Fahrnheit: " + F);
    }
}