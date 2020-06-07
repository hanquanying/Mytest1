package e1;

public class DivFactory implements IFactory
{
    public Operation createOperation()
    {
        return new OperationDiv();
    }
}