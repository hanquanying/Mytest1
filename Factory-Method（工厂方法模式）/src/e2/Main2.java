package e2;

public class Main2 {
    public static void main(String[]args){
        IFactory factory = new UndergraduateFactory();//调用大学生工厂
        LeiFeng student = factory.createLeiFeng();//调用对象
        student.buyRice();//方法
        student.sweep();

        IFactory gwyfactory = new OfficialFactory();
        LeiFeng gwy = factory.createLeiFeng();
        gwy.buildRoad();




    }
}
