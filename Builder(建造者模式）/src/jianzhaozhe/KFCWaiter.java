package jianzhaozhe;

public class KFCWaiter {//指挥构造  相当于director,指挥构造   顺序4
    private MealBuilder mb;//声明MealBuilder，获得套餐A，B.......

    public KFCWaiter(MealBuilder mb){
        this.mb = mb;
    }
    public Meal construct(){//调用抽象方法，指挥构造
        //准备食物
        mb.BuildFood();
        //准备饮料
        mb.BuildDrinks();
        //准备完毕，返回一个完整的套餐给客户
        return mb.getMeal();
    }

}