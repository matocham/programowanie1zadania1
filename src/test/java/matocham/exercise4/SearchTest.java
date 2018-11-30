package matocham.exercise4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest {
    Search search = new Search();

    @Test
    public void shouldFindValueUsingFirstMethod() {
        int position = search.find(new int[]{4, 3, 65, 3, 3, 4, 5, 323, 65, 6}, 5);
        assertThat(position).isEqualTo(6);
    }

    @Test
    public void shouldNotFindValueUsingFirstMethod() {
        int position = search.find(new int[]{4, 3, 65, 3, 3, 4, -5, 323, 65, 6}, 5);
        assertThat(position).isEqualTo(-1);
    }

    @Test
    public void shouldFindValueUsingSecondMethod() {
        int[] ints = {1, 4, 6, 8, 10, 14, 17, 18, 56, 87, 98, 443};
        int position = search.find(ints, 1);
        assertThat(position).isEqualTo(0);
        position = search.find(ints, 443);
        assertThat(position).isEqualTo(ints.length - 1);
        position = search.find(ints, 17);
        assertThat(position).isEqualTo(6);
        position = search.find(ints, 14);
        assertThat(position).isEqualTo(5);
        position = search.find(ints, 6);
        assertThat(position).isEqualTo(2);
    }

    @Test
    public void shouldNotFindValueUsingSecondMethod() {
        int[] sortedArray = {1, 4, 6, 8, 10, 14, 17, 18, 56, 87, 98, 443};
        int position = search.find2(sortedArray, 19);
        assertThat(position).isEqualTo(-1);
    }
}