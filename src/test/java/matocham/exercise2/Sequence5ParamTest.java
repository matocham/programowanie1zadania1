package matocham.exercise2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class Sequence5ParamTest {
    private int input;
    private int expected;
    private Sequence sequence = new Sequence();
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 5 }, { 5, 8 }, { 6, 13 }, { 7, 21 }, { 8, 34 }
        });
    }

    public Sequence5ParamTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void shouldReturnSquaresOfGivenNumber(){
        assertThat(sequence.seq5(input)).isEqualTo(expected);
    }
}
