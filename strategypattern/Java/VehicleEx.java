package strategypattern.Java;

interface DriverStartegy {
    public void drive();
}

class NormalDriveStrategy implements DriverStartegy {

    @Override
    public void drive() {
        System.out.println("No need of any special capability drive.");
    }

}

class OffDriveStartegy implements DriverStartegy {

    @Override
    public void drive() {
        System.out.println("Required professional off drive capability.");
    }

}

class Vehicle {
    private DriverStartegy driverStartegy;

    public Vehicle(DriverStartegy driverStartegy) {
        this.driverStartegy = driverStartegy;
    }

    public void drive() {
        this.driverStartegy.drive();
    }
}

class PassangerVehicle extends Vehicle {

    PassangerVehicle() {
        super(new NormalDriveStrategy());
    }

}

class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new OffDriveStartegy());
    }
}

public class VehicleEx {
    public static void main(String[] args) {
        Vehicle passangerVehicle = new PassangerVehicle(); // or new OffRoadVehicle()
        passangerVehicle.drive(); // it will provide the drive info according to defined class. 

        // Vehicle offRoadVehicle = new OffRoadVehicle();
        // offRoadVehicle.drive();
    }
}
