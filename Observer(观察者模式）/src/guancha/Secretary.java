package guancha;

import java.util.ArrayList;
import java.util.List;

public class Secretary {//秘书得到信息，通知给每一个对象，秘书可以为通知者
    private List<StockObserver> observers	= new ArrayList<StockObserver>();
    private String	action;

    public void attach(StockObserver observer)
    {
        observers.add(observer);
    }

    public void announce()
    {
        for (StockObserver obj : observers)
        {
            obj.update();
        }
    }

    public String getAction()
    {
        return action;
    }

    public void setAction(String action)
    {
        this.action = action;
    }
}