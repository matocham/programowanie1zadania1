package matocham.exercise2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sequence2Test {
    private Sequence sequence = new Sequence();

    @Test
    public void shouldReturnProperSequenceElements(){
        assertThat(sequence.seq2(0)).isEqualTo(100);
        assertThat(sequence.seq2(1)).isEqualTo(10);
        assertThat(sequence.seq2(2)).isEqualTo(200);
        assertThat(sequence.seq2(3)).isEqualTo(20);
        assertThat(sequence.seq2(4)).isEqualTo(300);
        assertThat(sequence.seq2(5)).isEqualTo(30);
    }
}
