package matocham.exercise2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class Sequence4ParamTest {
    private int input;
    private int expected;
    private Sequence sequence = new Sequence();
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }, { 2, 4 }, { 5, 25 }, { 11, 121 }, { 20, 400 }, { 27, 729 }
        });
    }

    public Sequence4ParamTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void shouldReturnSquaresOfGivenNumber(){
        assertThat(sequence.seq4(input)).isEqualTo(expected);
    }
}
