package guancha;

public class Main {

    public static void main(String[] args) {

        Boss huhansan = new Boss();//老板自己通知的

        StockObserver tongshi1 = new StockObserver("魏关姹",  huhansan);
        huhansan.attach(tongshi1);
        NBAObserver tongshi2 = new NBAObserver("易管查",huhansan );
        huhansan.attach(tongshi2);
        huhansan.setAction("我胡汉三回来了！");

        GameObserver tongshi3 = new GameObserver("李明", (Subject) huhansan);
        huhansan.attach(tongshi3);
        huhansan.announce();




    }
}