package seven2;

//代理类
public class Proxy implements GiveGift
{
    Pursuit	gg;

    public Proxy(SchoolGirl mm)
    {
        gg = new Pursuit(mm);
    }

    public void giveChocolate()
    {
        gg.giveChocolate();
    }

    public void giveDolls()
    {
        gg.giveDolls();
    }

    public void giveFlowers()
    {
        gg.giveFlowers();
    }
}