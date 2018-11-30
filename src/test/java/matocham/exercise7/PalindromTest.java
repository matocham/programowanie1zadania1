package matocham.exercise7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromTest {
    Palindrom palindrom = new Palindrom();

    @Test
    public void shouldReturnTrueWhenWordIsPalindromFalseOtherwise() {
        assertThat(palindrom.isPalindrom("aa")).isEqualTo(true);
        assertThat(palindrom.isPalindrom("aaa")).isEqualTo(true);
        assertThat(palindrom.isPalindrom("kajak")).isEqualTo(true);
        assertThat(palindrom.isPalindrom("A to kanapa pana Kota")).isEqualTo(true);
        assertThat(palindrom.isPalindrom("słowo")).isEqualTo(false);
        assertThat(palindrom.isPalindrom("aab")).isEqualTo(false);
        assertThat(palindrom.isPalindrom("kajaki")).isEqualTo(false);
    }
}