class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }
}
class AdvancedCalculator extends Calculator { 
    int calculate(int a, int b) {
        return a + b + 1;
    }
}

public class SimpleCalculatorOverride {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(10, 5)); 

        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println(advCalc.calculate(10, 5)); 
   }
}
