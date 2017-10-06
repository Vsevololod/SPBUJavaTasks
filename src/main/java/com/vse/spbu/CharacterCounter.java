package com.vse.spbu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by vse on 06.10.17.
 * Don't copy without link.
 */
public class CharacterCounter {
    private String fileDump;

    public CharacterCounter setFile(Path path) {
        try {
            fileDump = new String( Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public long count(char testChar) {
        long x = 0;
        if (fileDump != null) {
            for (int i = 0; i < fileDump.length(); i++) {
                if (fileDump.charAt(i) == testChar) {
                    x++;
                }
            }
            return x;
        } else {
            return x;
        }
    }
}
