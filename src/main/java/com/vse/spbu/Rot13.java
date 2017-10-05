package com.vse.spbu;

import java.util.HashMap;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class Rot13 {
    public static final String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
    private static String s2 = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm ";

    private static final HashMap<Character,Character> map = new HashMap<>(27);
    static {
        for (int i = 0; i < 27; i++) {
            map.put(s1.charAt(i),s2.charAt(i));
        }
    }


    public static String apply(String s){
        char[] result = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            result[i] = map.get( s.charAt(i));
        }
        return new String(result);
    }
}
