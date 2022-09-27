public class Parser {
    private ComplexNumber number1;
    private ComplexNumber number2;
    private double first;
    public double second;
    private String operation;

    private String operation1;
    private String operation2;

    public Parser(String str) {                                    // ����������� ��� ������������ ��������������� �����
        String[] s = str.split(" ");
        first = Double.parseDouble(s[0]);
        operation = (s[1]);
        second = Double.parseDouble(s[2]);
    }

    public Parser(String[] complexOperand) {               // ����������� ��� ������������ ������������ �����

        String[] s1 = complexOperand[0].split(" ");
        String[] s2 = complexOperand[2].split(" ");

        operation = complexOperand[1];
        operation1 = s1[1];
        operation2 = s2[1];

        ComplexNumber complexNumber1 = new ComplexNumber(Double.parseDouble(s1[0]), Double.parseDouble(s1[2])); // ������������ ������������ ����� � 1 ������ � �������������� �����
        ComplexNumber complexNumber2 = new ComplexNumber(Double.parseDouble(s2[0]), Double.parseDouble(s2[2])); // ������������ ������������ ����� � 2 ������ � �������������� �����
        this.number1 = complexNumber1;
        this.number2 = complexNumber2;

    }

    public ComplexNumber getNumber1() {
        return number1;
    }

    public ComplexNumber getNumber2() {
        return number2;
    }

    public String getOperation1() {
        return operation1;
    }

    public String getOperation2() {
        return operation2;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperation() {
        return operation;
    }

}