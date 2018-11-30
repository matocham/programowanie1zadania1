package matocham.exercise11;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreatestCommonSubstringTest {

    @Test
    public void shouldReturnGreatestCommonPartUsingFirstMethod() {
        String s1 = "AAAAAABBAAABBBBBAABBAAAAABBBABAABBBBABBA";
        String s2 = "AAAABBBBBABBBAAAAAAABAABBAABBAAABBBAABBA";
        String commonPart = GreatestCommonSubstring.getGreatest(s1, s2);
        assertThat(commonPart).isEqualTo("AABBAAABBB");
    }

    @Test
    public void shouldReturnGreatestCommonPartUsingSecondMethod() {
        String s1 = "AAAAAABBAAABBBBBAABBAAAAABBBABAABBBBABBA";
        String s2 = "AAAABBBBBABBBAAAAAAABAABBAABBAAABBBAABBA";
        String commonPart = GreatestCommonSubstring.getGreatest2(s1, s2);
        assertThat(commonPart).isEqualTo("AABBAAABBB");
    }
}