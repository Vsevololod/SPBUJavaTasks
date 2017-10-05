package com.vse.spbu;
import java.util.function.BinaryOperator;

/**
 * Created by vse on 04.10.17.
 * Don't copy without link.
 */
public class EuclidAlgorithmImpl {
    public static int gcd(int p, int q,BinaryOperator f) {
        while (q != 0) {
            int temp = q;
            q = (int)f.apply(p, q);
            p = temp;
        }
        return p;
    }


}
