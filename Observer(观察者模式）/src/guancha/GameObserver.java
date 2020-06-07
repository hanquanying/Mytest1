package guancha;

public class GameObserver extends Observer  {//继承观察者，是具体的观察者对于update方法做重写操作
    public GameObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + "	" + name + "关闭游戏，继续工作！");//把消息发给订阅者
    }


}
