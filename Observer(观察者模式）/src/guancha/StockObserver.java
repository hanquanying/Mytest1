package guancha;

public class StockObserver  extends Observer {//继承观察者，是具体的观察者对于update方法做重写操作
    public StockObserver(String name, Subject sub)
    {
        super(name, sub);
    }

    @Override
    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");//股票观察者再重写update
    }

}
