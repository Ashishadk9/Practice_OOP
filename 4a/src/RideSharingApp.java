public class RideSharingApp {
    public static void main(String[]args){
        Vehicle car = new Car();
        car.startRide();
        System.out.println("Fare:" + car.calculateFare(15));
    }
}
