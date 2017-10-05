import com.vse.spbu.suppliers.DobleSupplier;
import com.vse.spbu.suppliers.IntSupplier;
import com.vse.spbu.suppliers.LineSupplier;
import com.vse.spbu.suppliers.WordsSupplier;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.function.Supplier;


/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class SuppliersCheck {

    private static String testStr = "12 45,12 14wer\niuyer 16 3495\niywer 345 345,345";

    @Test
    public static void testInt() {
        InputStream is = new ByteArrayInputStream(testStr.getBytes());
        IntSupplier intSupplier = new IntSupplier(is);

        Assert.assertEquals(intSupplier.get(), new Integer(12));
        Assert.assertEquals(intSupplier.get(), new Integer(16));
        Assert.assertEquals(intSupplier.get(), new Integer(3495));
        Assert.assertEquals(intSupplier.get(), new Integer(345));
    }

    @Test
    public static void testDouble() {
        InputStream is = new ByteArrayInputStream(testStr.getBytes());
        Supplier<Double> intSupplier = new DobleSupplier(is);

        Assert.assertEquals(intSupplier.get(), 12d);
        Assert.assertEquals(intSupplier.get(), 45.12);
        Assert.assertEquals(intSupplier.get(), 16.0);
        Assert.assertEquals(intSupplier.get(), 3495.0);
        Assert.assertEquals(intSupplier.get(), 345.0);
        Assert.assertEquals(intSupplier.get(), 345.345);
    }


    @Test
    public static void testWord() {
        InputStream is = new ByteArrayInputStream(testStr.getBytes());
        Supplier<String> intSupplier = new WordsSupplier(is);

        Assert.assertEquals(intSupplier.get(), "12");
        Assert.assertEquals(intSupplier.get(), "45,12");
        Assert.assertEquals(intSupplier.get(), "14wer");
        Assert.assertEquals(intSupplier.get(), "iuyer");
        Assert.assertEquals(intSupplier.get(), "16");

    }

    @Test
    public static void testLine() {
        InputStream is = new ByteArrayInputStream(testStr.getBytes());
        Supplier<String> intSupplier = new LineSupplier(is);

        Assert.assertEquals(intSupplier.get(), "12 45,12 14wer");
        Assert.assertEquals(intSupplier.get(), "iuyer 16 3495");
        Assert.assertEquals(intSupplier.get(), "iywer 345 345,345");

    }
}
