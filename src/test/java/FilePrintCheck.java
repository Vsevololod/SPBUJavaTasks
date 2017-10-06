import com.vse.spbu.CharacterCounter;
import com.vse.spbu.FileRandomPrintLines;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Paths;

/**
 * Created by vse on 06.10.17.
 * Don't copy without link.
 */
public class FilePrintCheck {
    @DataProvider
    public static Object[][] createCorrectData() {
        return new Object[][]{
                new Object[]{"t8.shakespeare.txt"}
        };
    }

    @Test(dataProvider = "createCorrectData", invocationCount = 5)
    public static void testSimpleMod(String fileName) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        String file = classloader.getResource(fileName).getFile();
        FileRandomPrintLines fileRandomPrintLines = new FileRandomPrintLines().readFile(Paths.get(file));
        Assert.assertNotNull(fileRandomPrintLines.getRandomLine());
    }
}
