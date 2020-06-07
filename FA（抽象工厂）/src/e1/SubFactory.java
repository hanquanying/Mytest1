package e1;

public class SubFactory implements IFactory
{
    public Operation createOperation()
    {
        return new OperationSub();
    }
}