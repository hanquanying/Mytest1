package cloth3;


public class Finery extends Person//finary继承了person类
{
    protected Person component;//main方法中偷偷替换

    public void decorate(Person component)
    {
        this.component = component;//装饰方法，核心
    }

    public void show()
    {
        if (null != component)  //如果对象不为空，对于已经添加过装饰的对象
        {
            component.show();  //show方法动态调用，动态显示出来
        }
    }
}