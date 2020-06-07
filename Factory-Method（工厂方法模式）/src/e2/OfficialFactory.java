package e2;

public class OfficialFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Official();//工厂返回方法
    }
}
