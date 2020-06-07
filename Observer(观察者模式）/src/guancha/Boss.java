package guancha;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{//依赖于抽象编程，不依赖具体编程，老板可以作为通知者
    private List<Observer> observers	= new ArrayList<Observer>();//
    private String	action;//定义老板动作

    @Override
    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer)
    {
        observers.remove(observer);//可删除观察者
    }

    @Override
    public void announce()
    {
        for (Observer obj : observers)
        {
            obj.update();//调用抽象观察者方法
        }
    }

    @Override
    public String getAction()
    {
        return action;
    }

    @Override
    public void setAction(String action)
    {
        this.action = action;
    }
}