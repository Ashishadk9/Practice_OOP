// Car class implements
class Car extends Vehicle{
    @Override
    void startRide(){
        System.out.println("Car ride start.");
    }
    @Override
    void endRide(){
        System.out.println("Car ride ened.");
    }
    @Override
    double calculateFare(double distance){
        return distance * 10; //Car fare per km
    }
}
