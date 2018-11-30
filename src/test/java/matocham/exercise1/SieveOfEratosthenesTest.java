package matocham.exercise1;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SieveOfEratosthenesTest {
    private SieveOfEratosthenes sieveOfErstotenes;

    @Before
    public void setup() {
        sieveOfErstotenes = new SieveOfEratosthenes();
    }

    @Test
    public void whenGivingPrimeShouldReturnTrue() {
        assertThat(sieveOfErstotenes.isPrime(2)).isTrue();
        assertThat(sieveOfErstotenes.isPrime(3)).isTrue();
        assertThat(sieveOfErstotenes.isPrime(11)).isTrue();
        assertThat(sieveOfErstotenes.isPrime(18899)).isTrue();
        assertThat(sieveOfErstotenes.isPrime(24509)).isTrue();
        assertThat(sieveOfErstotenes.isPrime(63113)).isTrue();
    }

    @Test
    public void whenGivingOtherShouldReturnFalse() {
        assertThat(sieveOfErstotenes.isPrime(6)).isFalse();
        assertThat(sieveOfErstotenes.isPrime(34)).isFalse();
        assertThat(sieveOfErstotenes.isPrime(78)).isFalse();
        assertThat(sieveOfErstotenes.isPrime(121)).isFalse();
        assertThat(sieveOfErstotenes.isPrime(9999)).isFalse();
        assertThat(sieveOfErstotenes.isPrime(5678)).isFalse();
    }

    @Test(expected = RuntimeException.class)
    public void whenNumberNotInRangeShouldThrowException() {
        sieveOfErstotenes.isPrime(0);
    }
}
