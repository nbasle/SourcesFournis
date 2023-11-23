
public class Main {

    private static final int TOTAL = 1000;
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = TOTAL;
        System.out.println("Initial value : " + result);

        result = calculator.subtract(result, 50);
        System.out.println("Minus 50 : " + result);

        result = calculator.add(result, 500);
        System.out.println("Plus 500 : " + result);

        result = calculator.divide(result, 2);
        System.out.println("Divided by 2 : " + result);

        result = calculator.multiply(result, 10);
        System.out.println("Muliplied by 10 : " + result);
    }
}
