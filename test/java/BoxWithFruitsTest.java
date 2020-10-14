import junit.framework.Assert;
import org.junit.Test;

public class BoxWithFruitsTest {
    private Object Apple;
    private Object Orange;
    private Assert Assertions;

    @Test
    
    void compare() {
        BoxWithFruits<Fruit> box = new BoxWithFruits<>(Apple, Orange);
        BoxWithFruits<Integer> intBox = new BoxWithFruits<>(Apple, Orange);

        boolean actual = box.compare(intBox);

        Assertions.assertTrue(actual);
    }

}
