package headfirst.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();

       Duck hisDuck = new HISDuck();
       hisDuck.performQuack();
       hisDuck.performFly();


    }
}
