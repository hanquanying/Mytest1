package jianzhaozhe;

public class SubMealBuilderC extends MealBuilder {//子套餐，套餐A，继承MealBuilder，可实例化  顺序3
    @Override
    public void BuildFood(){
        meal.setFood("披萨");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("红茶" );
    }

}