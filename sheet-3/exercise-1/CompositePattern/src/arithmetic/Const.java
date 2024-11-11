package arithmetic;

public class Const implements ArithmeticExpr {
    private int value;

    // Constructor
    public Const(int v) {
        value = v;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // toString method to display the value as a string
    @Override
    public String toString() {
        return Integer.toString(value);
    }

    // eval method for constants simply returns itself
    @Override
    public Const eval() {
        return this;
    }
}
