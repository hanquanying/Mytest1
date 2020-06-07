package java1;

public class OperationSub extends Operation//减法类，继承运算类
{
    public double getResult()////重写getResult()方法，这样修改其中一个算法，不用提供其他代码
    {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
