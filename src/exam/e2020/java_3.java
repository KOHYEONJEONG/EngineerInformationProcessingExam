package exam.e2020;

abstract class Vehicle{
    String name;
    abstract public String getName(String val); //자식은 꼭 구현해야 함.
    public String getName(){
        return "Vehicle name : "+name;
    }
}

class Car extends Vehicle{
    private String name;
    public Car(String val){
        name = super.name = val;
    }

    @Override
    public String getName(String val) {
        return null;
    }

    public String getName(byte[] val){
        return "Car name"+val;
    }
}

public class java_3 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        System.out.println(obj.getName()); //Vehicle name : Spark
    }
}
