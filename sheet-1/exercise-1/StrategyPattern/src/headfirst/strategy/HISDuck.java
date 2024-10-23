package headfirst.strategy;

public class HISDuck extends Duck {
    public HISDuck() {
      flyBehavior = new FlyTheHISWay();
      quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a his duck");
    }
}
