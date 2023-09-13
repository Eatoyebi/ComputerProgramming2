public class Car {
    public static void main(String[] args){}
    private double drive;
    private double fuel;
    private double fuelEfficiency;

    public Car(double mpg){
        fuelEfficiency = mpg;
        fuel= 0;
        drive = 0;
    }
public void addGas(double amount){
        fuel = fuel + amount;
}
public void drive(double distance){
        drive = drive + distance;
        fuel = fuel - (distance/fuelEfficiency);
}
public double getGasLevel(){
        return fuel;
}
}
