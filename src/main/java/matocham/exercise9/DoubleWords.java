package matocham.exercise9;

import java.util.ArrayList;
import java.util.List;

public class DoubleWords {
    private String text;

    public DoubleWords(String text) {
        this.text = text;
    }

    public List<String> getDoubleWords() {
        List<String> results = new ArrayList<>();
        for (int startIndex = 0; startIndex < text.length() - 1; startIndex++)
            for (int wordLength = 2; startIndex + wordLength <= text.length(); wordLength += 2) {
                int middleIndex = startIndex + wordLength / 2;
                if (text.substring(startIndex, middleIndex).equals(text.substring(middleIndex, startIndex + wordLength))) {
                    results.add(text.substring(startIndex, startIndex + wordLength));
                }
            }
        return results;
    }
}
