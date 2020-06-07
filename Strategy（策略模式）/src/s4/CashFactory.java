package s4;

public class CashFactory {  //
    public static CashSuper createCash(String type)
    {
        CashSuper cs = null;
        if ("正常收费".equals(type))
        {
            cs = new CashNormal();
        }
        else if ("满300返100".equals(type))
        {
            cs = new CashReturn(300, 100);
        }
        else if ("打8折".equals(type))
        {
            cs = new CashRebate(0.8);
        }

        return cs;
    }

}
