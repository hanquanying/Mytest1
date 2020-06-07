package jianzhaozhe;

public abstract class MealBuilder {//可以接口或抽象类，//建造实体的套餐 builder  顺序2
    Meal meal = new Meal();

    public abstract void BuildFood();

    public abstract void BuildDrinks();

    public Meal getMeal(){//
        return meal;
    }
}