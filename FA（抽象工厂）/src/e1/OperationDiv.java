package e1;

public class OperationDiv extends Operation{  //除法类，继承运算类


    public double getResult() throws Exception ////重写getResult()方法，这样修改其中一个算法，不用提供其他代码
    {
        double result = 0;
        result = getNumberA() / getNumberB();
        return result;
    }
}