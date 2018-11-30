package matocham.exercise2;

import org.junit.BeforeClass;
import org.junit.Test;

public class Sequence1Test {
    private static Sequence sequence;

    @BeforeClass
    public static void setUp(){
        sequence = new Sequence();
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenSequenceSizeExceeded(){
        sequence.seq1(100);
    }
}