public class Car {
    String color;
    String model;
    double currentSpeed;
    double maximumSpeed;

    Engine motor;

    public Car(String color, String model, double currentSpeed, double maximumSpeed) {
        this.motor = new Engine(200, "AP");
        this.color = color;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.maximumSpeed = maximumSpeed;
    }

    void turnOn() {
        System.out.println("Brumm... The car started");
    }
    void speedUp(double quantity) {
        this.currentSpeed = this.currentSpeed + quantity;
    }

    int gearChange() {
        if (this.currentSpeed < 0) {
            return -1;
        }
        if (this.currentSpeed >= 0 && this.currentSpeed < 40) {
            return 1;
        }
        if (this.currentSpeed >= 40 && this.currentSpeed < 80) {
            return 2;
        }
        return 3;
    }

}
