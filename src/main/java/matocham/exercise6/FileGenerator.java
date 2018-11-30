package matocham.exercise6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {
    public static void generateFile(int entriesNumber, String path) {
        File file = new File(path);
        Random random = new Random();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < entriesNumber; i++) {
                fileWriter.write((random.nextInt(201) - 100) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
