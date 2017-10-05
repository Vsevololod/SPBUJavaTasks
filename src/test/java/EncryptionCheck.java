import com.vse.spbu.EuclidAlgorithmImpl;
import com.vse.spbu.Rot13;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class EncryptionCheck {
    private final static Random random = new Random();

    private static String strGenerate() {
        int len = random.nextInt(512);
        char[] result = new char[len];
        for (int i = 0; i < len; i++) {
            result[i] = Rot13.s1.charAt(random.nextInt(26));
        }
        return new String(result);
    }
    @Test(invocationCount = 5)
    public static void strongTest() {
        String test = strGenerate();
        Assert.assertEquals(Rot13.apply(Rot13.apply(test)), test);
    }

}
