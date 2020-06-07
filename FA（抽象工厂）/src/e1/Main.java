package e1;

//客户端的代码
public class Main
{
    public static void main(String[] args)
    {
        /*加法*/
        IFactory operFactory = new AddFactory();////定义工厂加法新名字
        Operation oper = operFactory.createOperation();//从工厂中调用对象
        oper.setNumberA(5);//给对象赋值
        oper.setNumberB(1);
/*除法*/
        IFactory operFactory1 = new DivFactory();//定义工厂除法 新名字
        Operation oper1 = operFactory1.createOperation();//从工厂中调用对象
        oper1.setNumberA(5);//给对象赋值
        oper1.setNumberB(6);



/*加法*/
        try
        {
            double result = oper.getResult();
            System.out.println("结果是:" + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

/*除法*/
        try
        {
            double result = oper1.getResult();
            System.out.println("结果是:" + result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}