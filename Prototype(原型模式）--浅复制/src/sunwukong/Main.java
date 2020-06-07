package sunwukong;

//客户端代码
//客户端代码
public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {//
        Sunwukong a = new Sunwukong("孙悟空");//浅复制，不引用对象


        Sunwukong b = a.clone();


        Sunwukong c = a.clone();


        a.display();
        b.display();
        c.display();
    }
}
