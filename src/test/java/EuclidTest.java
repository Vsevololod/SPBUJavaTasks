import com.vse.spbu.EuclidAlgorithmImpl;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by vse on 04.10.17.
 * Don't copy without link.
 */
public class EuclidTest {
    @DataProvider
    public static Object[][] createCorrectData() {
        return new Object[][]{
                new Object[]{30, 36, 6},
                new Object[]{50, 25, 25}
        };
    }

    @Test(dataProvider = "createCorrectData")
    public static void testSimpleMod(int x1, int x2, int result) {
        Assert.assertEquals(EuclidAlgorithmImpl.gcd(x1, x2, (a, b) -> (int) a % (int) b), result);
    }

    @Test(dataProvider = "createCorrectData")
    public static void testFloorMod(int x1, int x2, int result) {
        Assert.assertEquals(EuclidAlgorithmImpl.gcd(x1, x2, (a, b) -> java.lang.Math.floorMod((int) a, (int) b)), result);
    }

    @Test(dataProvider = "createCorrectData")
    public static void testIEEEMod(int x1, int x2, int result) {
        Assert.assertEquals(EuclidAlgorithmImpl.gcd(x1, x2, (a, b) -> (int) java.lang.Math.IEEEremainder((int) a, (int) b)), result);

    }
}
