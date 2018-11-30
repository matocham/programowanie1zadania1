package matocham.exercise9;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleWordsTest {
    private DoubleWords words;

    @Before
    public void prepareWords(){
        String text = "ABBAABBAAABAABABBBAA";
        words = new DoubleWords(text);
    }

    @Test
    public void shouldReturnProperListOfDoubleWords() {
        assertThat(words.getDoubleWords()).containsExactly("ABBAABBA", "BB","BBAABBAA", "AA","BB", "AA", "AA","AABAAB", "ABAABA", "AA", "ABAB", "BB", "BB", "AA");
    }
}