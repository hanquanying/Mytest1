package e2;

public class SimpleFactory {//工厂类，进行判断
    public static LeiFeng createLeiFeng(String type)
    {
        LeiFeng result = null;

        if ("学雷锋的大学生".equals(type))
        {
            result = new Undergraduate();
        }
        else if ("社区志愿者".equals(type))
        {
            result = new Volunteer();
        }
        else if ("研究生".equals(type))
        {
            result = new Official();
        }
        return result;
    }
}