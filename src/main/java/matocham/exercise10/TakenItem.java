package matocham.exercise10;

public class TakenItem extends Item {
    private final double amount; // 0...1

    public TakenItem(double price, double weight, double amount) {
        super(price, weight);
        this.amount = amount;
    }

    public double getValue() {
        return amount * getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + " amount: " + amount + " value: " + getValue();
    }
}
