import com.vse.spbu.RandomStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import java.io.IOException;

/**
 * Created by vse on 05.10.17.
 * Don't copy without link.
 */
public class RandomStreamCheck {
    private Set<Long> num;

    public RandomStreamCheck(){
        num = new HashSet<>();
    }

    private void checkDifferent(long a){
        if(num.contains(a)){
            Assert.fail("found Equals");
        }else {
            num.add(a);
        }

    }

    @Test
    public void testSimpleMod() throws IOException {
        Stream<Long> s = RandomStream.getRS(25214903917L,11,2^48).limit(20);
        s.forEach(this::checkDifferent);
    }
}
