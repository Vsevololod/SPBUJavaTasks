package com.vse.spbu.suppliers;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class WordsSupplier implements Supplier<String> {
    private Scanner scanner;

    public WordsSupplier(InputStream is) {
        scanner = new Scanner(is);
    }

    @Override
    public String get() {
        if (scanner.hasNext()) {
            return scanner.next();
        } else {
            return "";
        }
    }
}
