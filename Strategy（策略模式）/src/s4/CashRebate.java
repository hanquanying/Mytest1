package s4;

public class CashRebate implements CashSuper {
    private double	moneyRebate	= 1;

    public CashRebate(double moneyRebate)
    {
        this.moneyRebate = moneyRebate;
    }

    public double acceptCash(double money)
    {
        return money * moneyRebate;
    }
}