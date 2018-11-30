package matocham.exercise2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class Sequence1ParamTest {
    private int input;
    private int expected;
    private Sequence sequence = new Sequence();
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 }, { 1, 3 }, { 2, 5 }, { 5, 11 }, { 11, 23 }, { 20, 41 }, { 27, 55 }
        });
    }

    public Sequence1ParamTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void shouldReturnProperSequenceElement(){
        assertThat(sequence.seq1(input)).isEqualTo(expected);
    }
}
