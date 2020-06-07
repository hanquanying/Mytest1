package jianzhaozhe;

public class SubMealBuilderA extends MealBuilder {//子套餐，套餐A，继承MealBuilder，可实例化   顺序3
    @Override
    public void BuildFood(){
        meal.setFood("Hambagar");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("kole" );
    }

}