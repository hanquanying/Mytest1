package jianli;

public class Resume implements Cloneable{//最终版
    //能够实现克隆的Java类必须实现一个标识接口Cloneable，表示这个Java类支持复制。
    private String  name;
    private String  sex;
    private String  age;
    private String  timeArea;
    private String  company;

    public Resume(String name)
    {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company)
    {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display()
    {
        System.out.println(name + "     " + sex + "     " + age);
        System.out.println("工作经历：" + timeArea + "   " + company);
    }
    @Override
    public Resume clone()
    {
        try
        {
            return (Resume) super.clone();////super对象代表克隆父类对象，调用完后强制改为Resume对象
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}