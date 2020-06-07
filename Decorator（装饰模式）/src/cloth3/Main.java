package cloth3;

//客户端代码
public class Main   //第六章：装饰模式
{
    public static void main(String[] args)
    {
        Person person = new Person("小菜");//装饰姓名

        System.out.println("第一种装扮：");

        Sneakers pqx = new Sneakers();//进行装饰
        BigTrouser kk = new BigTrouser();//进行装饰
        TShirts dtx = new TShirts();//进行装饰   ，然后在Finery中进行调用

        pqx.decorate(person);//先对小菜进行球鞋装饰
        kk.decorate(pqx);//在破球鞋基础上装扮大裤衩，破球鞋对象把Finery中内容进行替换，
        // pqx对象是Finery类型，finary继承了person类
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮：");

        LeatherShoes px = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.decorate(person);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();
    }
}
