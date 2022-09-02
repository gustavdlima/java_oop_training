public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci	=	new	Fibonacci();
        for	(int i = 1; i <= 6; i++) {
            int	result = fibonacci.calculate(i);
            System.out.println(result);
        }
    }
}
