package e1;

public class OperationFactory//运算工厂类，进行判断
{
    public static Operation createOperation(String operate)
    {
        Operation oper = null;

        if ("+".equals(operate))
            oper = new OperationAdd();
        else if ("-".equals(operate))
            oper = new OperationSub();
        else if ("*".equals(operate))
            oper = new OperationMul();
        else if ("/".equals(operate))
            oper = new OperationDiv();

        return oper;
    }
}