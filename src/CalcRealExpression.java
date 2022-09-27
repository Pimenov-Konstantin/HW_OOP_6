public class CalcRealExpression implements MathArithmeticsReal {
    private double a;
    private double b;
    private String mathOperation;


    public CalcRealExpression(Parser parser) {
        this.a = parser.getFirst();
        this.b = parser.getSecond();
        this.mathOperation = parser.getOperation();
    }


    public double solveReal() throws IllegalAccessException {
        switch (mathOperation) {
            case "+":
                return sumReal(a,b);
            case "-":
                return subReal(a,b);
            case "/":
                return divReal();
            case "*":
                return mulReal();
            default:
                throw new IllegalAccessException("IllegalAccessException");
        }
    }


    @Override
    public double divReal() {
        if (b == 0) System.out.println("Error: devide by zero");
        return a / b;
    }

    @Override
    public double mulReal() {
        return a * b;
    }
}
