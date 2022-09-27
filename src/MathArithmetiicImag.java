public interface MathArithmetiicImag {




    public default double divMulImag(double a1, double a2, double b1, double b2, String operation1, String operation2, String mathOperation) {
        double a2b2 = (a2 * a2 + b2 * b2);
        int i = 1;
        if (mathOperation.equals("*")){
            i = -1;
            a2b2 = 1;
        }
        if (operation1.equals("+") && operation2.equals("-")) return (b1 * a2 - i*(a1 * -b2)) / a2b2;
        else if (operation1.equals("-") && operation2.equals("+")) return (-b1 * a2 - i*(a1 * b2)) / a2b2;
        else if (operation1.equals("-") && operation2.equals("-")) return (-b1 * a2 - i*(a1 * -b2)) / a2b2;
        else return (b1 * a2 - i*(a1 * b2)) / a2b2;

    }


    public default double sumSubImag( double b1, double b2, String operation1, String operation2, String mathOperation)  {
        int i = 1;
        if (mathOperation.equals("-")) i = -1;
        if (operation1.equals("+") && operation2.equals("-")) return b1 - i*b2;
        else if (operation1.equals("-") && operation2.equals("+")) return -b1 + i*b2;
        else if (operation1.equals("-") && operation2.equals("-")) return -b1 - i*b2;
        else return b1 + i*b2;

    }



}