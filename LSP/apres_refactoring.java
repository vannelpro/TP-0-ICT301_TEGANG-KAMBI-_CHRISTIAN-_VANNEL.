public class Bird {}

public class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

public class NonFlyingBird extends Bird {
    public void walk() {
        System.out.println("Walking...");
    }
}

public class Penguin extends NonFlyingBird {}
