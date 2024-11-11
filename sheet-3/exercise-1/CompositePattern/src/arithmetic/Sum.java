package arithmetic;

public class Sum implements ArithmeticExpr {
    private ArithmeticExpr left;
    private ArithmeticExpr right;

    // Constructor
    public Sum(ArithmeticExpr left, ArithmeticExpr right) {
        this.left = left;
        this.right = right;
    }

    // eval method for addition
    @Override
    public Const eval() {
        return new Const(left.eval().getValue() + right.eval().getValue());
    }

    // toString method to represent the sum expression as a string
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
