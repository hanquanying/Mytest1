package e2;

public class VolunteerFactory implements  IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();//工厂返回方法
    }
}
