public class Main {
    public static void main(String[] args) {
        Car meuCarro = new Car("Blue", "Bravo", 0, 240);
        meuCarro.turnOn();
        meuCarro.speedUp(20);
        meuCarro.gearChange();
        System.out.println(meuCarro.currentSpeed);
    }
}
