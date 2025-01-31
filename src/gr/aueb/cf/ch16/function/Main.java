package gr.aueb.cf.ch16.function;

public class Main {
    public static void main(String[] args) {
        ICalculator addition = new AdditionCalculator();
        int result = addition.operate(1,2);
        System.out.println(result);

        ICalculator sub = new ICalculator() {   // Ανώνυμη κλάση
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int result2 = sub.operate(10, 6);   // Την χρησιμοποιούμε κατευθείαν εδώ.
        System.out.println(result2);

        ICalculator mul = (a, b) -> a * b; //Lamda expression . πιο γρήγορο από το από πάνω.
        int result3 = mul.operate(3, 7);
        System.out.println(result3);

    }
}
