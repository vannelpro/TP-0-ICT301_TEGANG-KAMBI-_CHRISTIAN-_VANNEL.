public interface Runner {
    void run();
}

public interface Swimmer {
    void swim();
}

public interface Flyer {
    void fly();
}

public class Dog implements Runner, Swimmer {
    public void run() {}
    public void swim() {}
}
