package BinaryOperations;

public class BinaryOperations {

    public static Double addition(Double leftOperand, Double rightOperand)
    {
        return leftOperand + rightOperand;
    }

    public static Double subtraction(Double leftOperand, Double rightOperand)
    {
        return leftOperand - rightOperand;
    }    

    public static Double multiplication(Double leftOperand, Double rightOperand)
    {
        return leftOperand * rightOperand;
    }       

    public static Double division(Double leftOperand, Double rightOperand)
    {
        if(rightOperand == 0.0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        else return leftOperand / rightOperand;
    }   
}