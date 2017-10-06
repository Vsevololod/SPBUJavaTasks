import com.vse.spbu.CharacterCounter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URL;
import java.nio.file.Paths;

/**
 * Created by vse on 06.10.17.
 * Don't copy without link.
 */
public class FileCountCharCheck {
    @DataProvider
    public static Object[][] createCorrectData() {
        return new Object[][]{
                new Object[]{"t8.shakespeare.txt", 'h', 218406},
                new Object[]{"t8.shakespeare.txt", 'm', 95580}
        };
    }

    @Test(dataProvider = "createCorrectData")
    public static void testSimpleMod(String fileName, char charTest, int count) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        String file = classloader.getResource(fileName).getFile();
        CharacterCounter characterCounter = new CharacterCounter().setFile(Paths.get(file));
        Assert.assertEquals(characterCounter.count(charTest), count);
    }
}
