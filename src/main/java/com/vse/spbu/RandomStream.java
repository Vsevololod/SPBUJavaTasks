package com.vse.spbu;

import java.util.stream.Stream;

/**
 * Created by vse on 06.10.17.
 * Don't copy without link.
 */
public class RandomStream {
    public static Stream<Long> getRS(long a, long c, long m) {
        return Stream.iterate(1L, n -> (a * n + c) % m);
    }
}
