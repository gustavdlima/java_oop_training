public class Fibonacci {
    public int calculate(int number) {
       return (number <= 1) ? number : calculate((number - 1)) + calculate(number - 2);
    }
}