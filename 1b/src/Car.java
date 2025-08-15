public class Car {
    String color;// instance variable
    public static void main(String[]args){
        Car car1=new Car();
        car1.color="Red";

        Car car2=new Car();
        car2.color="Green";

        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}

