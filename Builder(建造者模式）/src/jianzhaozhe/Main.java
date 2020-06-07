package jianzhaozhe;

public class Main {  //顺序5

    public static void main(String[] args) {
        // 套餐A
        SubMealBuilderA a = new SubMealBuilderA();//子类类型复制基类类型
        //套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);//把A套餐对象传进去
        //获得套餐
        Meal mealA = waiter.construct();
        System.out.print("A套餐有：");
        System.out.println("食物："+mealA.getFood()+"；   "+"饮品："+mealA.getDrinks());


        SubMealBuilderB b = new SubMealBuilderB();//子类类型复制基类类型
        //套餐B的服务员
        KFCWaiter waiter1 = new KFCWaiter(b);//把B套餐对象传进去
        //获得套餐
        Meal mealB = waiter1.construct();//construct 指挥构造
        System.out.print("B套餐有：");
        System.out.println("食物："+mealB.getFood()+"；   "+"饮品："+mealB.getDrinks());

        SubMealBuilderC c= new SubMealBuilderC();

        KFCWaiter waiter2 = new KFCWaiter(c);

        Meal mealC = waiter2.construct();
        System.out.print("C套餐有：");
        System.out.println("食物："+mealC.getFood()+"；   "+"饮品："+mealC.getDrinks());


    }
}