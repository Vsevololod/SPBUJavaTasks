package com.vse.spbu.suppliers;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class LineSupplier implements Supplier<String> {
    private Scanner scanner;

    public LineSupplier(InputStream is) {
        scanner = new Scanner(is);
    }

    @Override
    public String get() {
        if (scanner.hasNext()) {
            return scanner.nextLine();
        } else {
            return "";
        }
    }
}
