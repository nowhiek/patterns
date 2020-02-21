interface Visitor {
    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Whell whell);
}

interface Car {
    void accept(Visitor visitor);
}

class Engine implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Whell implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class SportCar implements Car {
    Car[] cars;
    public SportCar(){
        cars = new Car[]{new Engine(), new Whell()};
    }
    public void accept(Visitor visitor) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].accept(visitor);
        }
        visitor.visit(this);
    }
}

class CarVisitor implements Visitor {
    public void visit(SportCar computer) {
        print("car");
    }
    public void visit(Engine engine) {
        print("engine");
    }
    public void visit(Whell whell) {
        print("whell");
    }
    private void print(String string) {
        System.out.println(string);
    }
}

public class VisitorTest {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}
