package ec.edu.espoch.concessionaire.Implementacion;

public class Automobiles {
        public double accelerate(double speed) {
        if (currentSpeed + speed > maximumSpeed) {
            System.out.println("No se puede acelerar: se superaria la velocidad máxima de " + maximumSpeed + "Km/h");
        } else {
            currentSpeed += speed;
        }
        return currentSpeed;

    }

    public double decelerate(double speed) {
        if (currentSpeed - speed <= 0) {
            System.out.println("No se puede desacelerar menos de 0 km/h");
        } else {
            currentSpeed -= speed;        
        }
        return currentSpeed;

    }

    public double brake() {
        return currentSpeed = 0;
    }

    public double estimateArrivalTime(double distance) {
        double time = distance / currentSpeed;

        return time;
    }

    public void display() {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("engine: " + engine);
        System.out.println("fuelType: " + fuelType);
        System.out.println("carType: " + carType);
        System.out.println("numberOfDoors: " + numberOfDoors);
        System.out.println("numberOfSeats: " + numberOfSeats);
        System.out.println("maximumSpeed: " + maximumSpeed);
        System.out.println("color: " + color);
        System.out.println("currentSpeed: " + currentSpeed);

    }
}
