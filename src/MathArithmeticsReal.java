public interface MathArithmeticsReal {

    public default double sumReal(double a,double b){

        return a + b;
    }

    public default double subReal(double a,double b) {
        return a - b;

    }

    double divReal();

    double mulReal() ;

}