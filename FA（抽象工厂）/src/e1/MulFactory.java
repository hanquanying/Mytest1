package e1;

public class MulFactory implements IFactory
{
    public Operation createOperation()
    {
        return new OperationMul();
    }
}