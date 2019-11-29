public class Run {
    public static void main(String[] args){

        Car jackysCar = new Car();
        Car johhnysCar = new Car();

//        johhnysCar.displayCarInfo();

        jackysCar.carWheelsChange(3);
        jackysCar.hugeChange();
        jackysCar.carWheelsChange(4);
        jackysCar = new Car();


        jackysCar.displayCarInfo();
//        Car reeseCar = jackysCar;
//        reeseCar.displayCarInfo();
    }
}
