package e1;

//加减乘除各建立一个具体工厂去实现这个接口
public class AddFactory implements IFactory
{
    public Operation createOperation()
    {
        return new OperationAdd();
    }
}