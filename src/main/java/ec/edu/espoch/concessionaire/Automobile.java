package ec.edu.espoch.concessionaire;

import ec.edu.espoch.concessionaire.enumeration.CarType;
import ec.edu.espoch.concessionaire.enumeration.Color;
import ec.edu.espoch.concessionaire.enumeration.FuelType;

public class Automobile {

    //CONSTRUCTOR
    public Automobile(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoors, int numberOfSeats, double maximumSpeed, Color color, double currentSpeed) {
    this.brand = brand;
    this.model = model;
    this.engine = engine;
    this.fuelType = fuelType;
    this.carType = carType;
    this.numberOfDoors = numberOfDoors;
    this.numberOfSeats = numberOfSeats;
    this.maximumSpeed = maximumSpeed;
    this.color = color;
    this.currentSpeed = currentSpeed;
    }
    //CONSTRUCTOR VACIO
    public Automobile() {
    }

    
// ATRIBUTOS
    private String brand;
    private int model;
    private double engine;
    private FuelType fuelType;
    private CarType carType;
    private int numberOfDoors;
    private int numberOfSeats;
    private double maximumSpeed;
    private Color color;
    private double currentSpeed;

    //SETTER AND GETTER
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    //METODOS
    
    
    
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
