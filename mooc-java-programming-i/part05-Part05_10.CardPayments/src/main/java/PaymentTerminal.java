
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.50) {
            return payment;
        }
        this.money += 2.50;
        this.affordableMeals++;
        double change = payment - 2.50;
        return change;
    }

    public double eatHeartily(double payment) {
        if (payment < 4.30) {
            return payment;
        }
        this.money += 4.30;
        this.heartyMeals++;
        double change = payment - 4.30;
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.50) {
            return false;
        }
        this.affordableMeals++;
        card.takeMoney(2.50);
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30) {
            return false;
        }
        this.heartyMeals++;
        card.takeMoney(4.30);
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        this.money += sum;
        card.addMoney(sum);
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
