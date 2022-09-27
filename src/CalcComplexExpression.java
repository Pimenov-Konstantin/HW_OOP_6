public class CalcComplexExpression implements MathArithmetiicImag, MathArithmeticsReal {

    private double a1;
    private double b1;
    private double a2;
    private double b2;
    private String mathOperation;
    private String operation1;
    private String operation2;

    public CalcComplexExpression(double a1, String operation1, double b1, String mathOperation, double a2, String operation2, double b2) {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
        this.mathOperation = mathOperation;
        this.operation1 = operation1;
        this.operation2 = operation2;

    }

    public String solveComplex() {


        switch (mathOperation) {
            case "+":
                return String.valueOf(sumReal(a1,a2)) + " + " + String.valueOf(sumSubImag(b1, b2, operation1, operation2, mathOperation)) + "i";
            case "-":
                return String.valueOf(subReal(a1,a2)) + " + " + String.valueOf(sumSubImag(b1, b2, operation1, operation2, mathOperation)) + "i";

            case "/":
                return String.valueOf(divReal()) + " + " + String.valueOf(divMulImag(a1, a2, b1, b2, operation1, operation2,mathOperation )) + "i";
            case "*":
                return String.valueOf(mulReal()) + " + " + String.valueOf(divMulImag(a1, a2, b1, b2, operation1, operation2,mathOperation )) + "i";

            default:
                return "";
        }
    }


    @Override
    public double divReal() {

        if (operation1.equals("+") && operation2.equals("-")) return (a1 * a2 + b1 * -b2) / (a2 * a2 + b2 * b2);
        else if (operation1.equals("-") && operation2.equals("+")) return (a1 * a2 + -b1 * b2) / (a2 * a2 + b2 * b2);
        else if (operation1.equals("-") && operation2.equals("-")) return (a1 * a2 + -b1 * -b2) / (a2 * a2 + b2 * b2);
        else return (a1 * a2 + b1 * b2) / (a2 * a2 + b2 * b2);

    }

    @Override
    public double mulReal() {

        if (operation1.equals("+") && operation2.equals("-")) return (a1 * a2 - b1 * -b2);
        else if (operation1.equals("-") && operation2.equals("+")) return (a1 * a2 - -b1 * b2);
        else if (operation1.equals("-") && operation2.equals("-")) return (a1 * a2 - -b1 * -b2);
        else return (a1 * a2 - b1 * b2);

    }

}




