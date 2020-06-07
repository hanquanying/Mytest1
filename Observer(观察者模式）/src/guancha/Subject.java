package guancha;

public interface Subject {
    //抽象通知者由于不希望依赖于抽象观察者，所以增加和减少的就没有必要了，抽象观察者已经不存在了，通知者接口如下
    //发布者接口
    //进行添加，通告
    void attach(Observer observer);

    void detach(Observer observer);

    void announce();//把老板，秘书信息给别人

    String getAction();//获取，老板，秘书的信息

    void setAction(String action);
}