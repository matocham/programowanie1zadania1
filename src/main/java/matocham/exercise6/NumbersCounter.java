package matocham.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersCounter {
    private String filename;

    public NumbersCounter(String filename) {
        this.filename = filename;
    }

    public void count() throws IOException {
        List<Integer> numberFromFile = Files.lines(Paths.get(filename)).filter(l -> !l.trim().isEmpty()).map(Integer::valueOf).collect(Collectors.toList());
        int totalCount = 0;
        for (Integer number : numberFromFile) {
            totalCount += number;
            System.out.println(totalCount);
        }
    }
}
