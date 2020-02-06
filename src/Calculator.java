public class Calculator {

    static double n1;
    static double n2;

    public static double add(double n1, double n2) {
        Calculator.n1 = n1;
        Calculator.n2 = n2;
        double result = n1 + n2;
        return result;
    }


}
