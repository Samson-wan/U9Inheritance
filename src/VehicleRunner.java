public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    
    
    Bicycle mybicycle = new Bicycle("Butterfly", 2, 0);
    System.out.println(mybicycle.getName());
    System.out.println(mybicycle.getWheels());
    System.out.println(mybicycle.getGearCount());
    mybicycle.move(20);
    mybicycle.turn(120);
    mybicycle.brake((0.3));
    mybicycle.ringBell();

    Plane myPlane = new Plane("Boeing 747", 3, 350);
    System.out.println(myPlane.getName());
    System.out.println(myPlane.getWheels());
    System.out.println(myPlane.getPassengers());
    myPlane.move(100);
    myPlane.turn(180);
    myPlane.fly();
  }
}