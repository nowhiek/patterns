interface Engine {
    void setEngine();
}

abstract class Car {
    protected Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    abstract public void setEngine();
}

class SportCar extends Car {
    public SportCar(Engine engine) {
        super(engine);
    }
    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }
}

class UnknownCar extends Car {
    public UnknownCar(Engine engine) {
        super(engine);
    }
    public void setEngine() {
        System.out.print("UnknownCar engine: ");
        engine.setEngine();
    }
}

class SportEngine implements Engine {
    public void setEngine(){
        System.out.println("sport");
    }
}

class UnknownEngine implements Engine {
    public void setEngine(){
        System.out.println("unknown");
    }
}

public class BridgeTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car unknownCar = new UnknownCar(new UnknownEngine());
        unknownCar.setEngine();
    }
}
