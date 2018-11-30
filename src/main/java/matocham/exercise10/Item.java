package matocham.exercise10;

public class Item {
    double price;
    double weight;

    public Item(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPricePerUnit(){
        return weight /price;
    }

    @Override
    public String toString(){
        return "price: " + price + " weight: " + weight;
    }
}
