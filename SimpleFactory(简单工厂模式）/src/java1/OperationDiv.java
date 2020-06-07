package java1;

public class OperationDiv extends Operation{  //除法类，继承运算类


        public double getResult() throws Exception ////重写getResult()方法，这样修改其中一个算法，不用提供其他代码
        {
            double result = 0;
            result = getNumberA() / getNumberB();
            return result;
        }
    }
/*public class OperationDiv extends Operation {
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0)
            {
                throw new Exception("除数不能为0");
            }
        result = getNumberA() / getNumberB();
        return result;
    }
}  */