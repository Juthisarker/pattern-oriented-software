package headfirst.strategy;

public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack(); // Squeaks
        rubberDuck.performFly();   // Can't fly

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();

        decoyDuck.setQuackBehavior(new QuackSilence());// Silence
        decoyDuck.performQuack();   // Can't fly
    }
}

