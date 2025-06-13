package OracleJava21zo830.Inheritance.SuperAndThis.SuperThisIII;

public class Vehicle {
    String type, model;
    int maxSpeed;

    public Vehicle(String type, String model, int maxSpeed) {
        this.type = type;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
