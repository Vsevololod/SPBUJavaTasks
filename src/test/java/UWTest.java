import com.vse.spbu.UnzipAndSearch;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class UWTest {
    @Test
    public static void testSimpleMod() throws IOException {
        new UnzipAndSearch().list();
    }
}
