import arithmetic.*;

public class Main {
    public static void main(String[] args) {
        // Test cases

        // Simple constants
        Const three = new Const(3);
        Const four = new Const(4);
        Const five = new Const(5);

        // Expression: 3 + 4
        Sum expr1 = new Sum(three, four);
        System.out.println(expr1 + " = " + expr1.eval());

        // Expression: 4 * 5
        Prod expr2 = new Prod(four, five);
        System.out.println(expr2 + " = " + expr2.eval());

        // Expression: (3 + 4) * 5
        Prod expr3 = new Prod(expr1, five);
        System.out.println(expr3 + " = " + expr3.eval());

        // Expression: 3 + (4 * 5)
        Sum expr4 = new Sum(three, expr2);
        System.out.println(expr4 + " = " + expr4.eval());

        // Complex expression: ((3 + 4) * 5) + 3
        Sum expr5 = new Sum(expr3, three);
        System.out.println(expr5 + " = " + expr5.eval());
    }
}
