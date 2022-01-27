package day13;

public class Car {
    String color;
    String engine;
    int doors;


    Car(String color, String engine, int doors){
    this.color = color;
    this.engine = engine;
    this.doors = doors;
    }
}


class CarTest {
    void DoorChange(Car c, int doors){
        c.doors = doors;
    }

void Change_Color(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
}


    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red","V8",4);
        Car car2 = new Car("black", "V4", 2);
        ct.DoorChange(car1,3);
        ct.Change_Color(car1,car2);
        System.out.println("info about first car : Color : " + car1.color + "  engine : " + car1.engine + " doors : " + car1.doors);
        System.out.println("info about second car : Color : " + car2.color + "  engine : " + car2.engine + " doors : " + car2.doors);

    }
}
