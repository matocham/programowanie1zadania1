package matocham.exercise10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BackpackProblem {
    private List<Item> items;
    private double backpackSize;
    private double leftInTheBackpack;

    public BackpackProblem(List<Item> items, double backpackSize) {
        this.items = items;
        this.backpackSize = backpackSize;
        leftInTheBackpack = backpackSize;
    }

    public List<TakenItem> getBestContents(){
        List<TakenItem> resultingItems = new ArrayList<>();
        for (Item item : items) {
            if(item.getWeight() < leftInTheBackpack){
                leftInTheBackpack -= item.getWeight();
                resultingItems.add(new TakenItem(item.getPrice(), item.getWeight(), 1.0));
            } else {
                resultingItems.add(new TakenItem(item.getPrice(), item.getWeight(), leftInTheBackpack/item.getWeight()));
                leftInTheBackpack = 0;
                break;
            }
        }
        return resultingItems;
    }
}
