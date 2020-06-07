package seven2;

//客户端代码
public class Main  //第七章 代理模式
{
    public static void main(String[] args)
    {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
