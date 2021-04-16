import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ArrayConverterTest {
    private ArrayConverter arrayConverter;

    @BeforeEach
    public void init() {
        arrayConverter = new ArrayConverter();
    }

    @Test
    public void testGetNewArray() {
        Assertions.assertEquals(Arrays.toString(new int[]{5, 6}), Arrays.toString(arrayConverter.getNewArr(new int[]{1, 2, 3, 4, 5, 6})));
    }

    @Test
    public void testGetNewArray2() {
        Assertions.assertEquals(Arrays.toString(new int[]{5, 6, 1, 2}), Arrays.toString(arrayConverter.getNewArr(new int[]{4, 5, 6, 1, 2})));
    }

    @Test
    public void testGetNewArray3() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Arrays.toString(arrayConverter.getNewArr(new int[]{5, 6, 1, 2}));  //4-к нету - ловим исключение
        });
    }

    @Test
    public void testGetNewArray4() {
        Assertions.assertEquals(Arrays.toString(new int[]{}), Arrays.toString(arrayConverter.getNewArr(new int[]{4, 5, 6, 4})));
    }
}

