public interface Animal {
    void run();
    void swim();
    void fly();
}

public class Dog implements Animal {
    public void run() {}
    public void swim() {}
    public void fly() { 
        throw new UnsupportedOperationException("A dog cannot fly");
    }
}
