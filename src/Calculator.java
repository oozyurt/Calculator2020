public class Calculator {

    static double n1;
    static double n2;

    public static double add(double n1, double n2) {
        Calculator.n1 = n1;
        Calculator.n2 = n2;
        return n1 + n2;
    }

    public static double substrac(double n1, double n2) {
        Calculator.n1 = n1;
        Calculator.n2 = n2;
        return n1 - n2;
    }

    public static void main(String[] args) {
        System.out.println("ADD: "+add(10,20));
        System.out.println("Subtract: "+substrac(10,20));
    }

}
