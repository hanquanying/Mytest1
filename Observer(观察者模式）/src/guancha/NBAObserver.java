package guancha;

public class NBAObserver extends Observer {//继承观察者，是具体的观察者对于update方法做重写操作
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");////NBA观察者再重写update
    }
}