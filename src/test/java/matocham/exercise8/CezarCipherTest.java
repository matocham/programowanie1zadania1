package matocham.exercise8;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CezarCipherTest {

    private CezarCipher cipher = new CezarCipher(3);
    @Test
    public void shouldCipher() {
        String words = "NIEPRZYJACIEL JEST BARDZO BLISKO";
        assertThat(cipher.cipher(words)).isEqualTo("QLHSUCBMDFLHO MHVW EDUGCR EOLVNR");
    }

    @Test
    public void shouldDecipher() {
        String words = "QLHSUCBMDFLHO MHVW EDUGCR EOLVNR";
        assertThat(cipher.decipher(words)).isEqualTo("NIEPRZYJACIEL JEST BARDZO BLISKO");
    }
}