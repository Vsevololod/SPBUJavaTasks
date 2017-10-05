package com.vse.spbu.suppliers;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class DobleSupplier implements Supplier<Double> {
    private Scanner scanner;

    public DobleSupplier(InputStream is) {
        scanner = new Scanner(is);
    }

    @Override
    public Double get() {
        while (scanner.hasNext()){
            if(scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }else {
                scanner.next();
            }
        }
        return null;
    }
}
