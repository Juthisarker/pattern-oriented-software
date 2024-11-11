package arithmetic;

public class Prod implements ArithmeticExpr {
    private ArithmeticExpr left;
    private ArithmeticExpr right;

    // Constructor
    public Prod(ArithmeticExpr left, ArithmeticExpr right) {
        this.left = left;
        this.right = right;
    }

    // eval method for multiplication
    @Override
    public Const eval() {
        return new Const(left.eval().getValue() * right.eval().getValue());
    }

    // toString method to represent the product expression as a string
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}
