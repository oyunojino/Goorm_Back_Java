package Java_Basic_0914;

class Car {
    public String run() {
        return "Car is running";
    }
}
class Bus extends Car {
    public String run() {
        return "Bus is running";
    }
}
class Van extends Car {
    public String run() {
        return "Van is running";
    }
}
class Suv extends Car {
    public String run() {
        return "Suv is running";
    }
}
public class Basic_12_polymorphism {
    public static void main() {
        Car arr[] = new Car[3];

        arr[0] = new Bus();
        arr[1] = new Van();
        arr[2] = new Suv();
        System.out.println(arr[0].run());
        System.out.println(arr[1].run());
        System.out.println(arr[2].run());
    }
}
