import com.vse.spbu.EuclidAlgorithmImpl;
import com.vse.spbu.MyMath;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class TypeConvertCheck {
    @DataProvider
    public static Object[][] createCorrectData() {
        return new Object[][]{
                new Object[]{"88F76A", 8976234},
                new Object[]{"96A811",9873425},
                new Object[]{"8703",34563}
        };
    }

    @Test(dataProvider = "createCorrectData")
    public static void testSimpleMod(String hex, int dec) {
        Assert.assertEquals(MyMath.hex2dec(hex),dec);
    }
}
