import com.vse.spbu.MyStreamUtils;
import com.vse.spbu.UnzipAndSearch;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

/**
 * Created by vse on 06.10.17.
 * Don't copy without link.
 */
public class StreamUtilsCheck {
    @Test
    public static void testZip() throws IOException {
        Stream<Integer> a = IntStream.range(20,40).limit(10).boxed();
        Stream<Integer> b = IntStream.iterate(2, x -> x + 2).limit(13).boxed();
        List<Integer> actual = MyStreamUtils.zip(a, b).collect(toCollection(ArrayList::new));
        Assert.assertEquals(actual.size(),20);
        Assert.assertEquals((int)actual.get(10),25);
        Assert.assertEquals((int)actual.get(11),12);

    }
}
