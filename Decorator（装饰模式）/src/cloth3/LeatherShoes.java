package cloth3;

public class LeatherShoes extends Finery
{
    public void show()
    {
        super.show();//super对父类的show方法进行覆盖
        System.out.println("皮鞋");
    }
}