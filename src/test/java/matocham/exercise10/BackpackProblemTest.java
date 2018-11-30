package matocham.exercise10;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class BackpackProblemTest {
    BackpackProblem problem;

    @Test
    public void shouldGetBestContents() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(60, 10));
        items.add(new Item(70, 12));
        items.add(new Item(80, 16));
        problem = new BackpackProblem(items, 20);

        List<TakenItem> bestContents = problem.getBestContents();
        System.out.println(bestContents);
        double sum = bestContents.stream().mapToDouble(TakenItem::getValue).sum();
        assertEquals(118.3, sum,0.05);
    }
}