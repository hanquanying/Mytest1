package guancha;

public abstract class Observer {//抽象的观察者
    //Observer类，抽象观察者，为所有的具体观察者定义一个接口，
    // 在得到主题的通知时更新自己，这个接口叫做更新接口。
    // 抽象观察者一般用一个抽象类或者一个接口实现。更新接口通常包含一个update()方法，这个方法叫做更新方法。
    protected String	name;
    protected Subject	sub;//进行分装

    public Observer(String name, Subject sub)//Subject抽象发布者
    {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();//发布和订阅
}