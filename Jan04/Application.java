package Jan04;

public class Application {
    public static void main(String[] args) {
        Factory fact1 = new Factory();
        fact1.design();
        fact1.build();

        Car car1 = new Car();
        car1.build();
    }
}
