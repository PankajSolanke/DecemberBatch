package methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator() ;

        System.out.println("Sum of two numbes : " + calc.add(1,3));
        System.out.println("Sum of three numbers : " + calc.add(1,3,5));
    }
}
