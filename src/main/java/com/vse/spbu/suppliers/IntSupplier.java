package com.vse.spbu.suppliers;

import java.io.InputStream;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class IntSupplier implements Supplier<Integer> {
    private Scanner scanner;
    public IntSupplier(InputStream is){
        scanner = new Scanner(is);
    }
    @Override
    public Integer get() {
        while (scanner.hasNext()){
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            }else {
                scanner.next();
            }
        }
        return null;
    }
}
