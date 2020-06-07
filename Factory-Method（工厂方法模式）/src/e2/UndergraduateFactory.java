package e2;

public class UndergraduateFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();//工厂返回方法
    }
}
