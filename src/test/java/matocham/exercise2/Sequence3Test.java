package matocham.exercise2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sequence3Test {
    private Sequence sequence = new Sequence();

    @Test
    public void shouldReturnProperSequenceElements(){
        assertThat(sequence.seq3(0)).isEqualTo(0);
        assertThat(sequence.seq3(1)).isEqualTo(2);
        assertThat(sequence.seq3(2)).isEqualTo(4);
        assertThat(sequence.seq3(3)).isEqualTo(6);
        assertThat(sequence.seq3(4)).isEqualTo(4);
        assertThat(sequence.seq3(5)).isEqualTo(2);
        assertThat(sequence.seq3(6)).isEqualTo(0);
        assertThat(sequence.seq3(7)).isEqualTo(2);
    }
}
