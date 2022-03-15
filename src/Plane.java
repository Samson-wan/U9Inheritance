public class Plane extends Vehicle{
    private int passengers;

    public Plane(String name, int wheels, int passengers){
        super(name, wheels);
        this.passengers = passengers;
    }

    public int getPassengers(){
        return passengers;
    }

    public void fly(){
        System.out.println("I just went flying sheesh!");
    }
}
