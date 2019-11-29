public class Car {

        public int wheelNumber;
        public String carColor;
        private int carDoor;
        private String carBrand;

        public  Car(){
            wheelNumber = 4;
            carColor = "white";
            carDoor = 4;
            carBrand = "toyota";
        }

        public void carWheelsChange(int x){
            wheelNumber = x;
        }
        public void displayCarInfo(){
            System.out.println(carColor);
            System.out.println(wheelNumber);
            System.out.println(carBrand);
            System.out.println(carDoor);
        }

        public void hugeChange(){
            carWheelsChange(3);
            carDoor = 2;
            carColor = "red";
        }

        private void explode(){
            System.out.println("Boom!!");
        }
}
