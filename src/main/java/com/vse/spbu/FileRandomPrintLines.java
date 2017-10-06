package com.vse.spbu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

/**
 * Created by vse on 06.10.17.
 * Don't copy without link.
 */
public class FileRandomPrintLines {
    private List<String> lines;
    private final Random random = new Random();

    public FileRandomPrintLines readFile(Path p) {
        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String getRandomLine() {
        if (lines != null) {
            return lines.get(random.nextInt(lines.size()));
        } else {
            return null;
        }
    }
}
