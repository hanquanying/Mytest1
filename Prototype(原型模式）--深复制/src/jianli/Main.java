package jianli;

public class Main {  //第九章：原型模式 --深复制
    public static void main(String[]args){
        //而Object类提供一个clone()方法，可以将一个Java对象复制一份。
        // 因此在Java中可以直接使用Object提供的clone()方法来实现对象的克隆
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");

        Resume b = a.clone();
        b.setWorkExperience("1998-2006", "YY企业");

        Resume c = b.clone();
        c.setPersonalInfo("男", "24");

        a.display();
        b.display();
        c.display();
    }


}


//
//客户端的代码就清爽多了，而且你要是想改某人简历，只需要对这份简历做一定的修改就可以了，
// 不会影响到其他简历，相同的部分就不用再重复了。不过不知道这样子对性能是不是有大的提高
//每new一次，都需要执行一次构造函数，如果构造函数的执行时间很长，那么多次的执行这个初始化操作就实在是太低效了。
// 一般在初始化的信息不发生变化的情况下，克隆是最好的办法。这既隐藏了对象创建的细节，又对性能是大大的提高