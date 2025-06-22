public class Conversor {
public static double celsiusAFahrenheit(double celsius) {
return (celsius * 9/5) + 32;
}

public static double fahrenheitACelsius (double fahrenheit) {
return (fahrenheit - 32) * 5/9;
}

public static void main(String[] args) {
double c = 25;
double f = celsiusAFahrenheit(c);
System.out.println(c + " °C son " + f + " F");
f = 77;
c = fahrenheitACelsius (f);
System.out.println(f + " F son " + c + " °C");

}

